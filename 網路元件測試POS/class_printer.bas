B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.1
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	
	Dim s1 As Socket
	Private AStreams As AsyncStreams
	
	Dim uc_IsConnected  As Int 
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
	uc_IsConnected = 0
	
	
End Sub
public Sub Close()
	'關閉
	s1.Close
	AStreams.Close
	
End Sub
public Sub Open(tc_str As String ,tn_port As Int)  As ResumableSub
	Dim ln_ok As Int
	
	ln_ok = 0
	
	'先關閉舊的
	s1.Close	
	AStreams.Close

'	If AStreams.IsInitialized Then ' close any open socket (not likely since Pause took care of this...)
'		AStreams.Close
'	End If
'   
'	If s1.IsInitialized Then   ' close any open stream
'		s1.Close
'	End If
	
	'印表機連線
	s1.Initialize("s1")
	s1.Connect(tc_str , tn_port , 1000) '100=Printer address, 9100=Port number (please look up port number)
	Wait For  (s1) s1_Connected (Successful As Boolean)
	If Successful Then

		AStreams.Initialize(s1.InputStream, s1.OutputStream, "AStreams")
		
		ln_ok = 1
	End If
		
	Return ln_ok				
End Sub
public Sub Send(tc_data As String )  As ResumableSub
	Dim ln_ok As Int
	
	ln_ok = 1
	
	
	'AStreams.Write(tc_data.GetBytes("UTF8"))
	AStreams.Write(tc_data.GetBytes("big5"))
 
	Return ln_ok
End Sub
public Sub PrinterStatus()  As ResumableSub
	Dim lc_rec = "" As String
	
	Dim ESC As String
	Dim GS As String
	Dim FF As String
	Dim DLE As String
	
	Dim SendMsg="" As String
	
	ESC=Chr(0X1b)
	GS=Chr(0X1d)
	FF=Chr(0X0c)
	DLE=Chr(0x10)
	
	SendMsg = SendMsg & DLE & Chr(0x04) &  Chr(0x02 )
	
	AStreams.Write(SendMsg.GetBytes("UTF8"))
	Wait For AStreams_NewData(buffer() As Byte)

	If(buffer.Length==0) Then
		
		Return lc_rec
	End If


 
	Dim lc_str As String
	Dim lc_s1 As String
	lc_str= String2Binary( BytesToString(buffer, 0 , buffer.Length, "UTF8"))

	For i=0 To lc_str.Length -1
		
		lc_s1 = lc_str.CharAt(7-i)
		
		Select i
			Case  0
				'無錯誤訊息
			Case  1
				'無錯誤訊息
			Case  2
				If (lc_s1 == "1" ) Then
					lc_rec = lc_rec & lc_s1 & "上蓋打開"	&CRLF
				End If
				
			Case  3
				If (lc_s1 == "1" ) Then
					lc_rec = lc_rec & lc_s1 & "按下FEED"	&CRLF
				End If
				
			Case  4
				'無錯誤訊息
			Case  5
				If (lc_s1 == "1" ) Then
					lc_rec = lc_rec & lc_s1 & "沒有紙,停止打印"	&CRLF
				End If
				
			Case  6
				If (lc_s1 == "1" ) Then
					lc_rec = lc_rec & lc_s1 & "打印機錯誤"	&CRLF
				End If
				
			Case  7
				'無錯誤訊息
				
		End Select
	
			
	Next
	
 
	Return lc_rec
	
End Sub

Sub String2Binary(txt As String) As String
	Dim res As String = ""
	For Each b As Byte In txt.GetBytes("UTF8")
		Dim sb As StringBuilder
		sb.Initialize
		Dim x As Int = Bit.ShiftLeft(1, 31)
		For i = 0 To 31
			Dim ii As Int = Bit.And(Bit.And(0xff, b), x)
			If ii <> 0 Then    sb.Append("1") Else    sb.Append("0")
			x = Bit.UnsignedShiftRight(x, 1)
		Next
		res = res & NumberFormat2(sb.ToString, 8, 0, 0, False)' & " "
	Next
	Return res
End Sub

