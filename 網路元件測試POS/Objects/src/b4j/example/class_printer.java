package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class class_printer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.class_printer", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.class_printer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.SocketWrapper _s1 = null;
public anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams = null;
public int _uc_isconnected = 0;
public b4j.example.main _main = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Dim s1 As Socket";
_s1 = new anywheresoftware.b4a.objects.SocketWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private AStreams As AsyncStreams";
_astreams = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 7;BA.debugLine="Dim uc_IsConnected  As Int";
_uc_isconnected = 0;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="public Sub Close()";
 //BA.debugLineNum = 19;BA.debugLine="s1.Close";
_s1.Close();
 //BA.debugLineNum = 20;BA.debugLine="AStreams.Close";
_astreams.Close();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 13;BA.debugLine="uc_IsConnected = 0";
_uc_isconnected = (int) (0);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _open(String _tc_str,int _tn_port) throws Exception{
ResumableSub_Open rsub = new ResumableSub_Open(this,_tc_str,_tn_port);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Open extends BA.ResumableSub {
public ResumableSub_Open(b4j.example.class_printer parent,String _tc_str,int _tn_port) {
this.parent = parent;
this._tc_str = _tc_str;
this._tn_port = _tn_port;
}
b4j.example.class_printer parent;
String _tc_str;
int _tn_port;
int _ln_ok = 0;
boolean _successful = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 24;BA.debugLine="Dim ln_ok As Int";
_ln_ok = 0;
 //BA.debugLineNum = 26;BA.debugLine="ln_ok = 0";
_ln_ok = (int) (0);
 //BA.debugLineNum = 29;BA.debugLine="s1.Close";
parent._s1.Close();
 //BA.debugLineNum = 30;BA.debugLine="AStreams.Close";
parent._astreams.Close();
 //BA.debugLineNum = 41;BA.debugLine="s1.Initialize(\"s1\")";
parent._s1.Initialize("s1");
 //BA.debugLineNum = 42;BA.debugLine="s1.Connect(tc_str , tn_port , 1000) '100=Printer";
parent._s1.Connect(ba,_tc_str,_tn_port,(int) (1000));
 //BA.debugLineNum = 43;BA.debugLine="Wait For  (s1) s1_Connected (Successful As Boolea";
parent.__c.WaitFor("s1_connected", ba, this, (Object)(parent._s1));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_successful = (boolean) result[0];
;
 //BA.debugLineNum = 44;BA.debugLine="If Successful Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_successful) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 46;BA.debugLine="AStreams.Initialize(s1.InputStream, s1.OutputStr";
parent._astreams.Initialize(ba,parent._s1.getInputStream(),parent._s1.getOutputStream(),"AStreams");
 //BA.debugLineNum = 48;BA.debugLine="ln_ok = 1";
_ln_ok = (int) (1);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 51;BA.debugLine="Return ln_ok";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ln_ok));return;};
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _s1_connected(boolean _successful) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _printerstatus() throws Exception{
ResumableSub_PrinterStatus rsub = new ResumableSub_PrinterStatus(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrinterStatus extends BA.ResumableSub {
public ResumableSub_PrinterStatus(b4j.example.class_printer parent) {
this.parent = parent;
}
b4j.example.class_printer parent;
String _lc_rec = "";
String _esc = "";
String _gs = "";
String _ff = "";
String _dle = "";
String _sendmsg = "";
byte[] _buffer = null;
String _lc_str = "";
String _lc_s1 = "";
int _i = 0;
int step20;
int limit20;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 65;BA.debugLine="Dim lc_rec = \"\" As String";
_lc_rec = "";
 //BA.debugLineNum = 67;BA.debugLine="Dim ESC As String";
_esc = "";
 //BA.debugLineNum = 68;BA.debugLine="Dim GS As String";
_gs = "";
 //BA.debugLineNum = 69;BA.debugLine="Dim FF As String";
_ff = "";
 //BA.debugLineNum = 70;BA.debugLine="Dim DLE As String";
_dle = "";
 //BA.debugLineNum = 72;BA.debugLine="Dim SendMsg=\"\" As String";
_sendmsg = "";
 //BA.debugLineNum = 74;BA.debugLine="ESC=Chr(0X1b)";
_esc = BA.ObjectToString(parent.__c.Chr((int) (0x1b)));
 //BA.debugLineNum = 75;BA.debugLine="GS=Chr(0X1d)";
_gs = BA.ObjectToString(parent.__c.Chr((int) (0x1d)));
 //BA.debugLineNum = 76;BA.debugLine="FF=Chr(0X0c)";
_ff = BA.ObjectToString(parent.__c.Chr((int) (0x0c)));
 //BA.debugLineNum = 77;BA.debugLine="DLE=Chr(0x10)";
_dle = BA.ObjectToString(parent.__c.Chr((int) (0x10)));
 //BA.debugLineNum = 79;BA.debugLine="SendMsg = SendMsg & DLE & Chr(0x04) &  Chr(0x02 )";
_sendmsg = _sendmsg+_dle+BA.ObjectToString(parent.__c.Chr((int) (0x04)))+BA.ObjectToString(parent.__c.Chr((int) (0x02)));
 //BA.debugLineNum = 81;BA.debugLine="AStreams.Write(SendMsg.GetBytes(\"UTF8\"))";
parent._astreams.Write(_sendmsg.getBytes("UTF8"));
 //BA.debugLineNum = 82;BA.debugLine="Wait For AStreams_NewData(buffer() As Byte)";
parent.__c.WaitFor("astreams_newdata", ba, this, null);
this.state = 43;
return;
case 43:
//C
this.state = 1;
_buffer = (byte[]) result[0];
;
 //BA.debugLineNum = 84;BA.debugLine="If(buffer.Length==0) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_buffer.length==0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 86;BA.debugLine="Return lc_rec";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_lc_rec));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 91;BA.debugLine="Dim lc_str As String";
_lc_str = "";
 //BA.debugLineNum = 92;BA.debugLine="Dim lc_s1 As String";
_lc_s1 = "";
 //BA.debugLineNum = 93;BA.debugLine="lc_str= String2Binary( BytesToString(buffer, 0 ,";
_lc_str = parent._string2binary(parent.__c.BytesToString(_buffer,(int) (0),_buffer.length,"UTF8"));
 //BA.debugLineNum = 95;BA.debugLine="For i=0 To lc_str.Length -1";
if (true) break;

case 5:
//for
this.state = 42;
step20 = 1;
limit20 = (int) (_lc_str.length()-1);
_i = (int) (0) ;
this.state = 44;
if (true) break;

case 44:
//C
this.state = 42;
if ((step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20)) this.state = 7;
if (true) break;

case 45:
//C
this.state = 44;
_i = ((int)(0 + _i + step20)) ;
if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 97;BA.debugLine="lc_s1 = lc_str.CharAt(7-i)";
_lc_s1 = BA.ObjectToString(_lc_str.charAt((int) (7-_i)));
 //BA.debugLineNum = 99;BA.debugLine="Select i";
if (true) break;

case 8:
//select
this.state = 41;
switch (_i) {
case 0: {
this.state = 10;
if (true) break;
}
case 1: {
this.state = 12;
if (true) break;
}
case 2: {
this.state = 14;
if (true) break;
}
case 3: {
this.state = 20;
if (true) break;
}
case 4: {
this.state = 26;
if (true) break;
}
case 5: {
this.state = 28;
if (true) break;
}
case 6: {
this.state = 34;
if (true) break;
}
case 7: {
this.state = 40;
if (true) break;
}
}
if (true) break;

case 10:
//C
this.state = 41;
 if (true) break;

case 12:
//C
this.state = 41;
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 105;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (true) break;

case 15:
//if
this.state = 18;
if (((_lc_s1).equals("1"))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 106;BA.debugLine="lc_rec = lc_rec & lc_s1 & \"上蓋打開\"	&CRLF";
_lc_rec = _lc_rec+_lc_s1+"上蓋打開"+parent.__c.CRLF;
 if (true) break;

case 18:
//C
this.state = 41;
;
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 110;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (true) break;

case 21:
//if
this.state = 24;
if (((_lc_s1).equals("1"))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 111;BA.debugLine="lc_rec = lc_rec & lc_s1 & \"按下FEED\"	&CRLF";
_lc_rec = _lc_rec+_lc_s1+"按下FEED"+parent.__c.CRLF;
 if (true) break;

case 24:
//C
this.state = 41;
;
 if (true) break;

case 26:
//C
this.state = 41;
 if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 117;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (true) break;

case 29:
//if
this.state = 32;
if (((_lc_s1).equals("1"))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 118;BA.debugLine="lc_rec = lc_rec & lc_s1 & \"沒有紙,停止打印\"	&CRLF";
_lc_rec = _lc_rec+_lc_s1+"沒有紙,停止打印"+parent.__c.CRLF;
 if (true) break;

case 32:
//C
this.state = 41;
;
 if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 122;BA.debugLine="If (lc_s1 == \"1\" ) Then";
if (true) break;

case 35:
//if
this.state = 38;
if (((_lc_s1).equals("1"))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 //BA.debugLineNum = 123;BA.debugLine="lc_rec = lc_rec & lc_s1 & \"打印機錯誤\"	&CRLF";
_lc_rec = _lc_rec+_lc_s1+"打印機錯誤"+parent.__c.CRLF;
 if (true) break;

case 38:
//C
this.state = 41;
;
 if (true) break;

case 40:
//C
this.state = 41;
 if (true) break;

case 41:
//C
this.state = 45;
;
 if (true) break;
if (true) break;

case 42:
//C
this.state = -1;
;
 //BA.debugLineNum = 135;BA.debugLine="Return lc_rec";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_lc_rec));return;};
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _astreams_newdata(byte[] _buffer) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _send(String _tc_data) throws Exception{
ResumableSub_Send rsub = new ResumableSub_Send(this,_tc_data);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Send extends BA.ResumableSub {
public ResumableSub_Send(b4j.example.class_printer parent,String _tc_data) {
this.parent = parent;
this._tc_data = _tc_data;
}
b4j.example.class_printer parent;
String _tc_data;
int _ln_ok = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 54;BA.debugLine="Dim ln_ok As Int";
_ln_ok = 0;
 //BA.debugLineNum = 56;BA.debugLine="ln_ok = 1";
_ln_ok = (int) (1);
 //BA.debugLineNum = 60;BA.debugLine="AStreams.Write(tc_data.GetBytes(\"big5\"))";
parent._astreams.Write(_tc_data.getBytes("big5"));
 //BA.debugLineNum = 62;BA.debugLine="Return ln_ok";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ln_ok));return;};
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _string2binary(String _txt) throws Exception{
String _res = "";
byte _b = (byte)0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _x = 0;
int _i = 0;
int _ii = 0;
 //BA.debugLineNum = 139;BA.debugLine="Sub String2Binary(txt As String) As String";
 //BA.debugLineNum = 140;BA.debugLine="Dim res As String = \"\"";
_res = "";
 //BA.debugLineNum = 141;BA.debugLine="For Each b As Byte In txt.GetBytes(\"UTF8\")";
{
final byte[] group2 = _txt.getBytes("UTF8");
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_b = group2[index2];
 //BA.debugLineNum = 142;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 143;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 144;BA.debugLine="Dim x As Int = Bit.ShiftLeft(1, 31)";
_x = __c.Bit.ShiftLeft((int) (1),(int) (31));
 //BA.debugLineNum = 145;BA.debugLine="For i = 0 To 31";
{
final int step6 = 1;
final int limit6 = (int) (31);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 146;BA.debugLine="Dim ii As Int = Bit.And(Bit.And(0xff, b), x)";
_ii = __c.Bit.And(__c.Bit.And((int) (0xff),(int) (_b)),_x);
 //BA.debugLineNum = 147;BA.debugLine="If ii <> 0 Then    sb.Append(\"1\") Else    sb.Ap";
if (_ii!=0) { 
_sb.Append("1");}
else {
_sb.Append("0");};
 //BA.debugLineNum = 148;BA.debugLine="x = Bit.UnsignedShiftRight(x, 1)";
_x = __c.Bit.UnsignedShiftRight(_x,(int) (1));
 }
};
 //BA.debugLineNum = 150;BA.debugLine="res = res & NumberFormat2(sb.ToString, 8, 0, 0,";
_res = _res+__c.NumberFormat2((double)(Double.parseDouble(_sb.ToString())),(int) (8),(int) (0),(int) (0),__c.False);
 }
};
 //BA.debugLineNum = 152;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
