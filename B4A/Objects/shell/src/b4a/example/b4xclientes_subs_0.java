package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xclientes_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xclientes) ","b4xclientes",3,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xclientes","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"ClientesPage\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ClientesPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="apiClas.Initialize(\"https://utncloudcomputingapic";
Debug.ShouldStop(8388608);
__ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.clientes.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://utncloudcomputingapiclientes.azurewebsites.net/api/Clientes")));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xclientes._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xclientes._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xclientes._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xclientes._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtId As EditText";
b4xclientes._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",b4xclientes._txtid);
 //BA.debugLineNum = 5;BA.debugLine="Private txtNombre As EditText";
b4xclientes._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",b4xclientes._txtnombre);
 //BA.debugLineNum = 6;BA.debugLine="Private txtApellido As EditText";
b4xclientes._txtapellido = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtapellido",b4xclientes._txtapellido);
 //BA.debugLineNum = 7;BA.debugLine="Private txtDireccion As EditText";
b4xclientes._txtdireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtdireccion",b4xclientes._txtdireccion);
 //BA.debugLineNum = 8;BA.debugLine="Private txtCorreoElectronico As EditText";
b4xclientes._txtcorreoelectronico = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtcorreoelectronico",b4xclientes._txtcorreoelectronico);
 //BA.debugLineNum = 9;BA.debugLine="Private txtTelefono As EditText";
b4xclientes._txttelefono = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txttelefono",b4xclientes._txttelefono);
 //BA.debugLineNum = 10;BA.debugLine="Private txtTrabajoId As EditText";
b4xclientes._txttrabajoid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txttrabajoid",b4xclientes._txttrabajoid);
 //BA.debugLineNum = 11;BA.debugLine="Private apiClas As Clientes";
b4xclientes._apiclas = RemoteObject.createNew ("b4a.example.clientes");__ref.setField("_apiclas",b4xclientes._apiclas);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _cmdactualizar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdActualizar_Click (b4xclientes) ","b4xclientes",3,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("cmdactualizar_click")) { __ref.runUserSub(false, "b4xclientes","cmdactualizar_click", __ref); return;}
ResumableSub_cmdActualizar_Click rsub = new ResumableSub_cmdActualizar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdActualizar_Click extends BA.ResumableSub {
public ResumableSub_cmdActualizar_Click(b4a.example.b4xclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xclientes parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdActualizar_Click (b4xclientes) ","b4xclientes",3,__ref.getField(false, "ba"),__ref,57);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 58;BA.debugLine="Wait For (apiClas.Update(txtId.Text, txtNombre.Te";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xclientes", "cmdactualizar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.clientes.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtapellido" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtdireccion" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtcorreoelectronico" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txttelefono" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txttrabajoid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 59;BA.debugLine="If r = True Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_r,parent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 60;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 62;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _r) throws Exception{
}
public static void  _cmdcrear_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdCrear_Click (b4xclientes) ","b4xclientes",3,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("cmdcrear_click")) { __ref.runUserSub(false, "b4xclientes","cmdcrear_click", __ref); return;}
ResumableSub_cmdCrear_Click rsub = new ResumableSub_cmdCrear_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdCrear_Click extends BA.ResumableSub {
public ResumableSub_cmdCrear_Click(b4a.example.b4xclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xclientes parent;
RemoteObject _c = RemoteObject.declareNull("b4a.example.cliente");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdCrear_Click (b4xclientes) ","b4xclientes",3,__ref.getField(false, "ba"),__ref,47);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 48;BA.debugLine="Wait For (apiClas.Create(0,txtNombre.Text, txtApe";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xclientes", "cmdcrear_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.clientes.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtapellido" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtdireccion" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtcorreoelectronico" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txttelefono" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txttrabajoid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("c", _c);
;
 BA.debugLineNum = 49;BA.debugLine="If c.Id> 0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_c.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 50;BA.debugLine="txtId.Text = c.Id";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_c.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="Msgbox(\"Insertado el registro\", \"OK\")";
Debug.ShouldStop(262144);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Insertado el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 53;BA.debugLine="Msgbox(\"No se pudo insertar el registro\",\"OK\")";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo insertar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _cmdeliminar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdEliminar_Click (b4xclientes) ","b4xclientes",3,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("cmdeliminar_click")) { __ref.runUserSub(false, "b4xclientes","cmdeliminar_click", __ref); return;}
ResumableSub_cmdEliminar_Click rsub = new ResumableSub_cmdEliminar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdEliminar_Click extends BA.ResumableSub {
public ResumableSub_cmdEliminar_Click(b4a.example.b4xclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xclientes parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdEliminar_Click (b4xclientes) ","b4xclientes",3,__ref.getField(false, "ba"),__ref,66);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 67;BA.debugLine="Wait For (apiClas.Delete(txtId.Text)) Complete (r";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xclientes", "cmdeliminar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.clientes.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 68;BA.debugLine="If r = True Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_r,parent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"Registro Borrado\", \"OK\")";
Debug.ShouldStop(16);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Borrado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 70;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(32);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 71;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(64);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 72;BA.debugLine="txtApellido.Text = \"\"";
Debug.ShouldStop(128);
__ref.getField(false,"_txtapellido" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 73;BA.debugLine="txtDireccion.Text = \"\"";
Debug.ShouldStop(256);
__ref.getField(false,"_txtdireccion" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 74;BA.debugLine="txtCorreoElectronico.Text = \"\"";
Debug.ShouldStop(512);
__ref.getField(false,"_txtcorreoelectronico" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 75;BA.debugLine="txtTelefono.Text = \"\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_txttelefono" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 76;BA.debugLine="txtTrabajoId.Text = \"\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_txttrabajoid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 78;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _cmdleer_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdLeer_Click (b4xclientes) ","b4xclientes",3,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("cmdleer_click")) { __ref.runUserSub(false, "b4xclientes","cmdleer_click", __ref); return;}
ResumableSub_cmdLeer_Click rsub = new ResumableSub_cmdLeer_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdLeer_Click extends BA.ResumableSub {
public ResumableSub_cmdLeer_Click(b4a.example.b4xclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xclientes parent;
RemoteObject _r = RemoteObject.declareNull("b4a.example.cliente");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdLeer_Click (b4xclientes) ","b4xclientes",3,__ref.getField(false, "ba"),__ref,30);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 31;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xclientes", "cmdleer_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.clientes.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 32;BA.debugLine="If r.Id > 0 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_r.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 34;BA.debugLine="txtId.Text = r.Id";
Debug.ShouldStop(2);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 35;BA.debugLine="txtNombre.Text= r.Nombre";
Debug.ShouldStop(4);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="txtApellido.Text = r.Apellido";
Debug.ShouldStop(8);
__ref.getField(false,"_txtapellido" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_apellido" /*RemoteObject*/ )));
 BA.debugLineNum = 37;BA.debugLine="txtDireccion.Text = r.Direccion";
Debug.ShouldStop(16);
__ref.getField(false,"_txtdireccion" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_direccion" /*RemoteObject*/ )));
 BA.debugLineNum = 38;BA.debugLine="txtCorreoElectronico.Text = r.CorreoElectronico";
Debug.ShouldStop(32);
__ref.getField(false,"_txtcorreoelectronico" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_correoelectronico" /*RemoteObject*/ )));
 BA.debugLineNum = 39;BA.debugLine="txtTelefono.Text = r.Telefono";
Debug.ShouldStop(64);
__ref.getField(false,"_txttelefono" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_telefono" /*RemoteObject*/ )));
 BA.debugLineNum = 40;BA.debugLine="txtTrabajoId.Text = r.TrabajoId";
Debug.ShouldStop(128);
__ref.getField(false,"_txttrabajoid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_trabajoid" /*RemoteObject*/ )));
 BA.debugLineNum = 41;BA.debugLine="Msgbox(\"Registro leido con éxito\", \"OK\")";
Debug.ShouldStop(256);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro leido con éxito")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 43;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(1024);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _cmdmenu_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdMenu_Click (b4xclientes) ","b4xclientes",3,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("cmdmenu_click")) { return __ref.runUserSub(false, "b4xclientes","cmdmenu_click", __ref);}
 BA.debugLineNum = 82;BA.debugLine="Private Sub cmdMenu_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
Debug.ShouldStop(262144);
b4xclientes._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPage")));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xclientes) ","b4xclientes",3,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xclientes","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Return Me";
Debug.ShouldStop(32768);
if (true) return __ref;
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}