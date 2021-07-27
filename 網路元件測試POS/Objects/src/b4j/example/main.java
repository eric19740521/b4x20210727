package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 500);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnsend = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnconnect = null;
public static anywheresoftware.b4a.objects.SocketWrapper _c4 = null;
public static anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _server = null;
public static anywheresoftware.b4a.randomaccessfile.AsyncStreams _astream = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblstatus = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblmyip = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _edtname = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _edtage = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _edtip = null;
public static anywheresoftware.b4j.objects.CanvasWrapper _cvs = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textarea1 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button1 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textarea2 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textarea3 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btn_03 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btn_04 = null;
public static class _mymessage{
public boolean IsInitialized;
public String Name;
public int Age;
public byte[] Image;
public void Initialize() {
IsInitialized = true;
Name = "";
Age = 0;
Image = new byte[0];
;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 37;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 38;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\") 'Load the layou";
_mainform.getRootPane().LoadLayout(ba,"1");
 //BA.debugLineNum = 39;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public static String  _astream_error() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub AStream_Error";
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public static String  _astream_newdata(byte[] _buffer) throws Exception{
String _lc_str = "";
String _lc_s1 = "";
int _i = 0;
 //BA.debugLineNum = 178;BA.debugLine="Sub AStream_NewData (Buffer() As Byte)";
 //BA.debugLineNum = 181;BA.debugLine="TextArea1.Text =\"\"";
_textarea1.setText("");
 //BA.debugLineNum = 182;BA.debugLine="TextArea1.Text = String2Binary( BytesToString(Buf";
_textarea1.setText(_string2binary(anywheresoftware.b4a.keywords.Common.BytesToString(_buffer,(int) (0),_buffer.length,"UTF8")));
 //BA.debugLineNum = 184;BA.debugLine="Dim lc_str As String";
_lc_str = "";
 //BA.debugLineNum = 185;BA.debugLine="Dim lc_s1 As String";
_lc_s1 = "";
 //BA.debugLineNum = 186;BA.debugLine="lc_str= TextArea1.Text";
_lc_str = _textarea1.getText();
 //BA.debugLineNum = 191;BA.debugLine="If(TextArea3.Text == \"1\") Then";
if (((_textarea3.getText()).equals("1"))) { 
 //BA.debugLineNum = 193;BA.debugLine="For i=0 To lc_str.Length -1";
{
final int step7 = 1;
final int limit7 = (int) (_lc_str.length()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 195;BA.debugLine="lc_s1 = lc_str.CharAt(7-i)";
_lc_s1 = BA.ObjectToString(_lc_str.charAt((int) (7-_i)));
 //BA.debugLineNum = 197;BA.debugLine="Select i";
switch (_i) {
case 0: {
 break; }
case 1: {
 break; }
case 2: {
 //BA.debugLineNum = 203;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (((_lc_s1).equals("1"))) { 
 //BA.debugLineNum = 204;BA.debugLine="TextArea2.Text = TextArea2.Text & lc_s1 & \"錢";
_textarea2.setText(_textarea2.getText()+_lc_s1+"錢箱PIN3信號為高"+anywheresoftware.b4a.keywords.Common.CRLF);
 };
 break; }
case 3: {
 //BA.debugLineNum = 208;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (((_lc_s1).equals("1"))) { 
 //BA.debugLineNum = 209;BA.debugLine="TextArea2.Text = TextArea2.Text & lc_s1 & \"打";
_textarea2.setText(_textarea2.getText()+_lc_s1+"打印機離線"+anywheresoftware.b4a.keywords.Common.CRLF);
 };
 break; }
case 4: {
 break; }
case 5: {
 break; }
case 6: {
 break; }
case 7: {
 break; }
}
;
 }
};
 };
 //BA.debugLineNum = 231;BA.debugLine="If(TextArea3.Text == \"2\") Then";
if (((_textarea3.getText()).equals("2"))) { 
 //BA.debugLineNum = 233;BA.debugLine="For i=0 To lc_str.Length -1";
{
final int step28 = 1;
final int limit28 = (int) (_lc_str.length()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
 //BA.debugLineNum = 235;BA.debugLine="lc_s1 = lc_str.CharAt(7-i)";
_lc_s1 = BA.ObjectToString(_lc_str.charAt((int) (7-_i)));
 //BA.debugLineNum = 237;BA.debugLine="Select i";
switch (_i) {
case 0: {
 break; }
case 1: {
 break; }
case 2: {
 //BA.debugLineNum = 243;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (((_lc_s1).equals("1"))) { 
 //BA.debugLineNum = 244;BA.debugLine="TextArea2.Text = TextArea2.Text & lc_s1 & \"上";
_textarea2.setText(_textarea2.getText()+_lc_s1+"上蓋打開"+anywheresoftware.b4a.keywords.Common.CRLF);
 };
 break; }
case 3: {
 //BA.debugLineNum = 248;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (((_lc_s1).equals("1"))) { 
 //BA.debugLineNum = 249;BA.debugLine="TextArea2.Text = TextArea2.Text & lc_s1 & \"按";
_textarea2.setText(_textarea2.getText()+_lc_s1+"按下FEED"+anywheresoftware.b4a.keywords.Common.CRLF);
 };
 break; }
case 4: {
 break; }
case 5: {
 //BA.debugLineNum = 255;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (((_lc_s1).equals("1"))) { 
 //BA.debugLineNum = 256;BA.debugLine="TextArea2.Text = TextArea2.Text & lc_s1 & \"沒";
_textarea2.setText(_textarea2.getText()+_lc_s1+"沒有紙,停止打印"+anywheresoftware.b4a.keywords.Common.CRLF);
 };
 break; }
case 6: {
 //BA.debugLineNum = 260;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (((_lc_s1).equals("1"))) { 
 //BA.debugLineNum = 261;BA.debugLine="TextArea2.Text = TextArea2.Text & lc_s1 & \"打";
_textarea2.setText(_textarea2.getText()+_lc_s1+"打印機錯誤"+anywheresoftware.b4a.keywords.Common.CRLF);
 };
 break; }
case 7: {
 break; }
}
;
 }
};
 };
 //BA.debugLineNum = 273;BA.debugLine="If(TextArea3.Text == \"3\") Then";
if (((_textarea3.getText()).equals("3"))) { 
 //BA.debugLineNum = 275;BA.debugLine="For i=0 To lc_str.Length -1";
{
final int step55 = 1;
final int limit55 = (int) (_lc_str.length()-1);
_i = (int) (0) ;
for (;_i <= limit55 ;_i = _i + step55 ) {
 //BA.debugLineNum = 277;BA.debugLine="lc_s1 = lc_str.CharAt(7-i)";
_lc_s1 = BA.ObjectToString(_lc_str.charAt((int) (7-_i)));
 //BA.debugLineNum = 279;BA.debugLine="Select i";
switch (_i) {
case 0: {
 break; }
case 1: {
 break; }
case 2: {
 break; }
case 3: {
 //BA.debugLineNum = 288;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (((_lc_s1).equals("1"))) { 
 //BA.debugLineNum = 289;BA.debugLine="TextArea2.Text = TextArea2.Text & lc_s1 & \"切";
_textarea2.setText(_textarea2.getText()+_lc_s1+"切刀錯誤"+anywheresoftware.b4a.keywords.Common.CRLF);
 };
 break; }
case 4: {
 break; }
case 5: {
 //BA.debugLineNum = 295;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (((_lc_s1).equals("1"))) { 
 //BA.debugLineNum = 296;BA.debugLine="TextArea2.Text = TextArea2.Text & lc_s1 & \"有";
_textarea2.setText(_textarea2.getText()+_lc_s1+"有不可恢復錯誤"+anywheresoftware.b4a.keywords.Common.CRLF);
 };
 break; }
case 6: {
 //BA.debugLineNum = 300;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (((_lc_s1).equals("1"))) { 
 //BA.debugLineNum = 301;BA.debugLine="TextArea2.Text = TextArea2.Text & lc_s1 & \"有";
_textarea2.setText(_textarea2.getText()+_lc_s1+"有自動恢復錯誤"+anywheresoftware.b4a.keywords.Common.CRLF);
 };
 break; }
case 7: {
 break; }
}
;
 }
};
 };
 //BA.debugLineNum = 314;BA.debugLine="If(TextArea3.Text == \"4\") Then";
if (((_textarea3.getText()).equals("4"))) { 
 //BA.debugLineNum = 316;BA.debugLine="For i=0 To lc_str.Length -1";
{
final int step79 = 1;
final int limit79 = (int) (_lc_str.length()-1);
_i = (int) (0) ;
for (;_i <= limit79 ;_i = _i + step79 ) {
 //BA.debugLineNum = 318;BA.debugLine="lc_s1 = lc_str.CharAt(7-i)";
_lc_s1 = BA.ObjectToString(_lc_str.charAt((int) (7-_i)));
 //BA.debugLineNum = 320;BA.debugLine="Select i";
switch (_i) {
case 0: {
 break; }
case 1: {
 break; }
case 2: 
case 3: {
 //BA.debugLineNum = 326;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (((_lc_s1).equals("1"))) { 
 //BA.debugLineNum = 327;BA.debugLine="TextArea2.Text = TextArea2.Text & lc_s1 & \"紙";
_textarea2.setText(_textarea2.getText()+_lc_s1+"紙將盡"+anywheresoftware.b4a.keywords.Common.CRLF);
 };
 break; }
case 4: {
 break; }
case 5: 
case 6: {
 //BA.debugLineNum = 333;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (((_lc_s1).equals("1"))) { 
 //BA.debugLineNum = 334;BA.debugLine="TextArea2.Text = TextArea2.Text & lc_s1 & \"紙";
_textarea2.setText(_textarea2.getText()+_lc_s1+"紙不存在"+anywheresoftware.b4a.keywords.Common.CRLF);
 };
 break; }
case 7: {
 break; }
}
;
 }
};
 };
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return "";
}
public static String  _astream_terminated() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub AStream_Terminated";
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public static String  _btn_01_click() throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Private Sub btn_01_Click";
 //BA.debugLineNum = 374;BA.debugLine="TextArea2.Text = \"錯誤訊息:\"	&CRLF";
_textarea2.setText("錯誤訊息:"+anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 375;BA.debugLine="TextArea3.Text = \"1\"";
_textarea3.setText("1");
 //BA.debugLineNum = 377;BA.debugLine="C4.close";
_c4.Close();
 //BA.debugLineNum = 378;BA.debugLine="astream.Close";
_astream.Close();
 //BA.debugLineNum = 381;BA.debugLine="C4.Initialize(\"C4\")";
_c4.Initialize("C4");
 //BA.debugLineNum = 382;BA.debugLine="C4.Connect(\"192.168.1.31\" , 9100 , 0) '100=Printe";
_c4.Connect(ba,"192.168.1.31",(int) (9100),(int) (0));
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return "";
}
public static String  _btn_02_click() throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Private Sub btn_02_Click";
 //BA.debugLineNum = 388;BA.debugLine="TextArea2.Text = \"錯誤訊息:\"	&CRLF";
_textarea2.setText("錯誤訊息:"+anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 389;BA.debugLine="TextArea3.Text = \"2\"";
_textarea3.setText("2");
 //BA.debugLineNum = 391;BA.debugLine="C4.close";
_c4.Close();
 //BA.debugLineNum = 392;BA.debugLine="astream.Close";
_astream.Close();
 //BA.debugLineNum = 395;BA.debugLine="C4.Initialize(\"C4\")";
_c4.Initialize("C4");
 //BA.debugLineNum = 396;BA.debugLine="C4.Connect(\"192.168.1.31\" , 9100 , 0) '100=Printe";
_c4.Connect(ba,"192.168.1.31",(int) (9100),(int) (0));
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return "";
}
public static String  _btn_03_click() throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Private Sub btn_03_Click";
 //BA.debugLineNum = 402;BA.debugLine="TextArea2.Text = \"錯誤訊息:\"	&CRLF";
_textarea2.setText("錯誤訊息:"+anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 403;BA.debugLine="TextArea3.Text = \"3\"";
_textarea3.setText("3");
 //BA.debugLineNum = 405;BA.debugLine="C4.close";
_c4.Close();
 //BA.debugLineNum = 406;BA.debugLine="astream.Close";
_astream.Close();
 //BA.debugLineNum = 409;BA.debugLine="C4.Initialize(\"C4\")";
_c4.Initialize("C4");
 //BA.debugLineNum = 410;BA.debugLine="C4.Connect(\"192.168.1.31\" , 9100 , 0) '100=Printe";
_c4.Connect(ba,"192.168.1.31",(int) (9100),(int) (0));
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return "";
}
public static String  _btn_04_click() throws Exception{
 //BA.debugLineNum = 414;BA.debugLine="Private Sub btn_04_Click";
 //BA.debugLineNum = 416;BA.debugLine="TextArea2.Text = \"錯誤訊息:\"	&CRLF";
_textarea2.setText("錯誤訊息:"+anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 417;BA.debugLine="TextArea3.Text = \"4\"";
_textarea3.setText("4");
 //BA.debugLineNum = 419;BA.debugLine="C4.close";
_c4.Close();
 //BA.debugLineNum = 420;BA.debugLine="astream.Close";
_astream.Close();
 //BA.debugLineNum = 423;BA.debugLine="C4.Initialize(\"C4\")";
_c4.Initialize("C4");
 //BA.debugLineNum = 424;BA.debugLine="C4.Connect(\"192.168.1.31\" , 9100 , 0) '100=Printe";
_c4.Connect(ba,"192.168.1.31",(int) (9100),(int) (0));
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return "";
}
public static void  _button1_click() throws Exception{
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
b4j.example.class_printer _obj = null;
int _result1 = 0;
String _result2 = "";
String _esc = "";
String _gs = "";
String _ff = "";
String _dle = "";
String _sendmsg = "";
int _result3 = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 63;BA.debugLine="Dim obj As class_printer";
_obj = new b4j.example.class_printer();
 //BA.debugLineNum = 66;BA.debugLine="TextArea2.Text = \"\"	&CRLF";
parent._textarea2.setText(""+anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 69;BA.debugLine="obj.Initialize";
_obj._initialize /*String*/ (ba);
 //BA.debugLineNum = 70;BA.debugLine="Wait For (obj.Open(\"192.168.1.31\",9100)) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _obj._open /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("192.168.1.31",(int) (9100)));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result1 = (int) result[0];
;
 //BA.debugLineNum = 71;BA.debugLine="Log(\"open result: \" & Result1)";
anywheresoftware.b4a.keywords.Common.Log("open result: "+BA.NumberToString(_result1));
 //BA.debugLineNum = 75;BA.debugLine="wait for (obj.PrinterStatus( ))	 Complete (Result";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _obj._printerstatus /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 6;
return;
case 6:
//C
this.state = 1;
_result2 = (String) result[0];
;
 //BA.debugLineNum = 76;BA.debugLine="Log(\"PrinterStatus result: \" & Result2)";
anywheresoftware.b4a.keywords.Common.Log("PrinterStatus result: "+_result2);
 //BA.debugLineNum = 80;BA.debugLine="If(Result2.Length>0)Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_result2.length()>0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 81;BA.debugLine="Log(\"error,中斷執行\")";
anywheresoftware.b4a.keywords.Common.Log("error,中斷執行");
 //BA.debugLineNum = 83;BA.debugLine="TextArea2.Text = \"錯誤訊息:\"	&CRLF";
parent._textarea2.setText("錯誤訊息:"+anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 84;BA.debugLine="TextArea2.Text = TextArea2.Text & Result2	&CRLF";
parent._textarea2.setText(parent._textarea2.getText()+_result2+anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 87;BA.debugLine="obj.Close";
_obj._close /*String*/ ();
 //BA.debugLineNum = 89;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 95;BA.debugLine="Dim ESC As String";
_esc = "";
 //BA.debugLineNum = 96;BA.debugLine="Dim GS As String";
_gs = "";
 //BA.debugLineNum = 97;BA.debugLine="Dim FF As String";
_ff = "";
 //BA.debugLineNum = 98;BA.debugLine="Dim DLE As String";
_dle = "";
 //BA.debugLineNum = 100;BA.debugLine="Dim SendMsg=\"\" As String";
_sendmsg = "";
 //BA.debugLineNum = 102;BA.debugLine="ESC=Chr(0X1b)";
_esc = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0x1b)));
 //BA.debugLineNum = 103;BA.debugLine="GS=Chr(0X1d)";
_gs = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0x1d)));
 //BA.debugLineNum = 104;BA.debugLine="FF=Chr(0X0c)";
_ff = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0x0c)));
 //BA.debugLineNum = 105;BA.debugLine="DLE=Chr(0x10)";
_dle = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0x10)));
 //BA.debugLineNum = 110;BA.debugLine="SendMsg = \"\"";
_sendmsg = "";
 //BA.debugLineNum = 112;BA.debugLine="SendMsg = \"\"";
_sendmsg = "";
 //BA.debugLineNum = 114;BA.debugLine="SendMsg = SendMsg & ESC & \"@\"  '初始化打印機";
_sendmsg = _sendmsg+_esc+"@";
 //BA.debugLineNum = 116;BA.debugLine="SendMsg = SendMsg & \"test測試1\" &CRLF";
_sendmsg = _sendmsg+"test測試1"+anywheresoftware.b4a.keywords.Common.CRLF;
 //BA.debugLineNum = 117;BA.debugLine="SendMsg = SendMsg & \"test測試2\" &CRLF";
_sendmsg = _sendmsg+"test測試2"+anywheresoftware.b4a.keywords.Common.CRLF;
 //BA.debugLineNum = 118;BA.debugLine="SendMsg = SendMsg & \"test測試3\" &CRLF";
_sendmsg = _sendmsg+"test測試3"+anywheresoftware.b4a.keywords.Common.CRLF;
 //BA.debugLineNum = 119;BA.debugLine="SendMsg = SendMsg & \"test測試4\" &CRLF";
_sendmsg = _sendmsg+"test測試4"+anywheresoftware.b4a.keywords.Common.CRLF;
 //BA.debugLineNum = 120;BA.debugLine="SendMsg = SendMsg & \"test測試5\" &CRLF";
_sendmsg = _sendmsg+"test測試5"+anywheresoftware.b4a.keywords.Common.CRLF;
 //BA.debugLineNum = 122;BA.debugLine="SendMsg = SendMsg & ESC & \"d\" &  Chr(5)   '打印並進紙";
_sendmsg = _sendmsg+_esc+"d"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (5)));
 //BA.debugLineNum = 123;BA.debugLine="SendMsg = SendMsg & GS & \"V\" & Chr(65) & Chr(0)";
_sendmsg = _sendmsg+_gs+"V"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (65)))+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0)));
 //BA.debugLineNum = 126;BA.debugLine="wait for (obj.Send( SendMsg ))	 Complete (Result3";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _obj._send /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sendmsg));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_result3 = (int) result[0];
;
 //BA.debugLineNum = 127;BA.debugLine="Log(\"send result: \" & Result3)";
anywheresoftware.b4a.keywords.Common.Log("send result: "+BA.NumberToString(_result3));
 //BA.debugLineNum = 130;BA.debugLine="obj.Close";
_obj._close /*String*/ ();
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(int _result1) throws Exception{
}
public static String  _c4_connected(boolean _successful) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub C4_Connected (Successful As Boolean)";
 //BA.debugLineNum = 136;BA.debugLine="Log(Successful)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_successful));
 //BA.debugLineNum = 137;BA.debugLine="If Successful Then";
if (_successful) { 
 //BA.debugLineNum = 139;BA.debugLine="astream.Initialize(C4.InputStream, C4.OutputStre";
_astream.Initialize(ba,_c4.getInputStream(),_c4.getOutputStream(),"aStream");
 //BA.debugLineNum = 141;BA.debugLine="CallSub(Null, uf_prints4)";
anywheresoftware.b4a.keywords.Common.CallSubNew(ba,anywheresoftware.b4a.keywords.Common.Null,_uf_prints4());
 }else {
 //BA.debugLineNum = 144;BA.debugLine="Log(\"Failed to connect: \" )";
anywheresoftware.b4a.keywords.Common.Log("Failed to connect: ");
 };
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 10;BA.debugLine="Type MyMessage (Name As String, Age As Int, Image";
;
 //BA.debugLineNum = 11;BA.debugLine="Private btnSend As Button";
_btnsend = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private btnConnect As Button";
_btnconnect = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim C4 As Socket";
_c4 = new anywheresoftware.b4a.objects.SocketWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Public server As ServerSocket";
_server = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private astream As AsyncStreams";
_astream = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 20;BA.debugLine="Private lblStatus As Label";
_lblstatus = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private lblMyIp As Label";
_lblmyip = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private edtName As TextField";
_edtname = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private edtAge As TextField";
_edtage = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private edtIP As TextField";
_edtip = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private cvs As Canvas";
_cvs = new anywheresoftware.b4j.objects.CanvasWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private TextArea1 As TextArea";
_textarea1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private TextArea2 As TextArea";
_textarea2 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private TextArea3 As TextArea";
_textarea3 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private btn_03 As Button";
_btn_03 = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private btn_04 As Button";
_btn_04 = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public static String  _string2binary(String _txt) throws Exception{
String _res = "";
byte _b = (byte)0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _x = 0;
int _i = 0;
int _ii = 0;
 //BA.debugLineNum = 355;BA.debugLine="Sub String2Binary(txt As String) As String";
 //BA.debugLineNum = 356;BA.debugLine="Dim res As String = \"\"";
_res = "";
 //BA.debugLineNum = 357;BA.debugLine="For Each b As Byte In txt.GetBytes(\"UTF8\")";
{
final byte[] group2 = _txt.getBytes("UTF8");
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_b = group2[index2];
 //BA.debugLineNum = 358;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 359;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 360;BA.debugLine="Dim x As Int = Bit.ShiftLeft(1, 31)";
_x = anywheresoftware.b4a.keywords.Common.Bit.ShiftLeft((int) (1),(int) (31));
 //BA.debugLineNum = 361;BA.debugLine="For i = 0 To 31";
{
final int step6 = 1;
final int limit6 = (int) (31);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 362;BA.debugLine="Dim ii As Int = Bit.And(Bit.And(0xff, b), x)";
_ii = anywheresoftware.b4a.keywords.Common.Bit.And(anywheresoftware.b4a.keywords.Common.Bit.And((int) (0xff),(int) (_b)),_x);
 //BA.debugLineNum = 363;BA.debugLine="If ii <> 0 Then    sb.Append(\"1\") Else    sb.Ap";
if (_ii!=0) { 
_sb.Append("1");}
else {
_sb.Append("0");};
 //BA.debugLineNum = 364;BA.debugLine="x = Bit.UnsignedShiftRight(x, 1)";
_x = anywheresoftware.b4a.keywords.Common.Bit.UnsignedShiftRight(_x,(int) (1));
 }
};
 //BA.debugLineNum = 366;BA.debugLine="res = res & NumberFormat2(sb.ToString, 8, 0, 0,";
_res = _res+anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_sb.ToString())),(int) (8),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.False);
 }
};
 //BA.debugLineNum = 368;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return "";
}
public static String  _uf_prints4() throws Exception{
String _esc = "";
String _gs = "";
String _ff = "";
String _dle = "";
String _sendmsg = "";
 //BA.debugLineNum = 149;BA.debugLine="Sub uf_prints4";
 //BA.debugLineNum = 153;BA.debugLine="Dim ESC As String";
_esc = "";
 //BA.debugLineNum = 154;BA.debugLine="Dim GS As String";
_gs = "";
 //BA.debugLineNum = 155;BA.debugLine="Dim FF As String";
_ff = "";
 //BA.debugLineNum = 156;BA.debugLine="Dim DLE As String";
_dle = "";
 //BA.debugLineNum = 158;BA.debugLine="Dim SendMsg=\"\" As String";
_sendmsg = "";
 //BA.debugLineNum = 160;BA.debugLine="ESC=Chr(0X1b)";
_esc = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0x1b)));
 //BA.debugLineNum = 161;BA.debugLine="GS=Chr(0X1d)";
_gs = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0x1d)));
 //BA.debugLineNum = 162;BA.debugLine="FF=Chr(0X0c)";
_ff = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0x0c)));
 //BA.debugLineNum = 163;BA.debugLine="DLE=Chr(0x10)";
_dle = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0x10)));
 //BA.debugLineNum = 168;BA.debugLine="SendMsg = \"\"";
_sendmsg = "";
 //BA.debugLineNum = 170;BA.debugLine="SendMsg = SendMsg & DLE & Chr(0x04) &  Chr(TextAr";
_sendmsg = _sendmsg+_dle+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0x04)))+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int)(Double.parseDouble(_textarea3.getText()))));
 //BA.debugLineNum = 171;BA.debugLine="astream.Write(SendMsg.GetBytes(\"UTF8\"))";
_astream.Write(_sendmsg.getBytes("UTF8"));
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
}
