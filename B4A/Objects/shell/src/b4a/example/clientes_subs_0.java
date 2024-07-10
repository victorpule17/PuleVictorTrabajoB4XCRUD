package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clientes_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private jsonParser As JSONParser";
clientes._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",clientes._jsonparser);
 //BA.debugLineNum = 3;BA.debugLine="Private apiJob As HttpJob";
clientes._apijob = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_apijob",clientes._apijob);
 //BA.debugLineNum = 4;BA.debugLine="Public apiURL As String";
clientes._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",clientes._apiurl);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _apellido,RemoteObject _direccion,RemoteObject _correoelectronico,RemoteObject _telefono,RemoteObject _trabajoid) throws Exception{
try {
		Debug.PushSubsStack("Create (clientes) ","clientes",8,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "clientes","create", __ref, _id, _nombre, _apellido, _direccion, _correoelectronico, _telefono, _trabajoid);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_id,_nombre,_apellido,_direccion,_correoelectronico,_telefono,_trabajoid);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.clientes parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _apellido,RemoteObject _direccion,RemoteObject _correoelectronico,RemoteObject _telefono,RemoteObject _trabajoid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._apellido = _apellido;
this._direccion = _direccion;
this._correoelectronico = _correoelectronico;
this._telefono = _telefono;
this._trabajoid = _trabajoid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _apellido;
RemoteObject _direccion;
RemoteObject _correoelectronico;
RemoteObject _telefono;
RemoteObject _trabajoid;
RemoteObject _clie = RemoteObject.declareNull("b4a.example.cliente");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (clientes) ","clientes",8,__ref.getField(false, "ba"),__ref,12);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("apellido", _apellido);
Debug.locals.put("direccion", _direccion);
Debug.locals.put("correoElectronico", _correoelectronico);
Debug.locals.put("telefono", _telefono);
Debug.locals.put("trabajoId", _trabajoid);
 BA.debugLineNum = 13;BA.debugLine="Dim clie As Cliente";
Debug.ShouldStop(4096);
_clie = RemoteObject.createNew ("b4a.example.cliente");Debug.locals.put("clie", _clie);
 BA.debugLineNum = 14;BA.debugLine="Dim json As String";
Debug.ShouldStop(8192);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 15;BA.debugLine="Dim data As Map";
Debug.ShouldStop(16384);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 17;BA.debugLine="clie.Initialize()";
Debug.ShouldStop(65536);
_clie.runClassMethod (b4a.example.cliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="json = \"{'id': \" & id & \", 'nombre': '\" & nombre";
Debug.ShouldStop(131072);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'id': "),_id,RemoteObject.createImmutable(", 'nombre': '"),_nombre,RemoteObject.createImmutable("', 'apellido': '"),_apellido,RemoteObject.createImmutable("', 'direccion': '"),_direccion,RemoteObject.createImmutable("', 'correoElectronico': '"),_correoelectronico,RemoteObject.createImmutable("', 'telefono': '"),_telefono,RemoteObject.createImmutable("', 'trabajoId': '"),_trabajoid,RemoteObject.createImmutable("'}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 20;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(524288);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 21;BA.debugLine="apiJob.PostString(apiURL, json)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json));
 BA.debugLineNum = 22;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(2097152);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 23;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "create"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 24;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 25;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 26;BA.debugLine="data = jsonParser.NextObject";
Debug.ShouldStop(33554432);
_data = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("data", _data);
 BA.debugLineNum = 27;BA.debugLine="clie.Id = data.Get(\"id\")";
Debug.ShouldStop(67108864);
_clie.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 28;BA.debugLine="clie.Nombre = data.Get(\"nombre\")";
Debug.ShouldStop(134217728);
_clie.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 29;BA.debugLine="clie.Apellido = data.Get(\"apellido\")";
Debug.ShouldStop(268435456);
_clie.setField ("_apellido" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("apellido"))))));
 BA.debugLineNum = 30;BA.debugLine="clie.Direccion = data.Get(\"direccion\")";
Debug.ShouldStop(536870912);
_clie.setField ("_direccion" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("direccion"))))));
 BA.debugLineNum = 31;BA.debugLine="clie.CorreoElectronico = data.Get(\"correoElectro";
Debug.ShouldStop(1073741824);
_clie.setField ("_correoelectronico" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("correoElectronico"))))));
 BA.debugLineNum = 32;BA.debugLine="clie.Telefono = data.Get(\"telefono\")";
Debug.ShouldStop(-2147483648);
_clie.setField ("_telefono" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telefono"))))));
 BA.debugLineNum = 33;BA.debugLine="clie.TrabajoId = data.Get(\"trabajoId\")";
Debug.ShouldStop(1);
_clie.setField ("_trabajoid" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("trabajoId"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 35;BA.debugLine="Return clie";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_clie));return;};
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (clientes) ","clientes",8,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "clientes","delete", __ref, _id);}
ResumableSub_Delete rsub = new ResumableSub_Delete(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.clientes parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _id;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (clientes) ","clientes",8,__ref.getField(false, "ba"),__ref,118);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 119;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 120;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 122;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "delete"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 123;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clientes) ","clientes",8,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clientes","initialize", __ref, _ba, _url);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("url", _url);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(url As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="apiURL = url";
Debug.ShouldStop(256);
__ref.setField ("_apiurl" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_all(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_All (clientes) ","clientes",8,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "clientes","read_all", __ref);}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.clientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _clien = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cli = RemoteObject.declareNull("b4a.example.cliente");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
int _i = 0;
int step12;
int limit12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_All (clientes) ","clientes",8,__ref.getField(false, "ba"),__ref,39);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 40;BA.debugLine="Dim clien As List";
Debug.ShouldStop(128);
_clien = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("clien", _clien);
 BA.debugLineNum = 41;BA.debugLine="Dim cli As Cliente";
Debug.ShouldStop(256);
_cli = RemoteObject.createNew ("b4a.example.cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 42;BA.debugLine="Dim map As Map";
Debug.ShouldStop(512);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 43;BA.debugLine="Dim lst As List";
Debug.ShouldStop(1024);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 45;BA.debugLine="clien.Initialize";
Debug.ShouldStop(4096);
_clien.runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(16384);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 48;BA.debugLine="apiJob.Download(apiURL)";
Debug.ShouldStop(32768);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "read_all"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 50;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 8;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 51;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(262144);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="lst = jsonParser.NextArray";
Debug.ShouldStop(524288);
_lst = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextArray");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 53;BA.debugLine="For i = 0 To lst.Size - 1";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//for
this.state = 7;
step12 = 1;
limit12 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step12)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 54;BA.debugLine="map = lst.Get(i)";
Debug.ShouldStop(2097152);
_map = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 55;BA.debugLine="cli.Initialize";
Debug.ShouldStop(4194304);
_cli.runClassMethod (b4a.example.cliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 56;BA.debugLine="cli.Id = map.Get(\"id\")";
Debug.ShouldStop(8388608);
_cli.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 57;BA.debugLine="cli.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(16777216);
_cli.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 58;BA.debugLine="cli.Apellido = map.Get(\"apellido\")";
Debug.ShouldStop(33554432);
_cli.setField ("_apellido" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("apellido"))))));
 BA.debugLineNum = 59;BA.debugLine="cli.Direccion = map.Get(\"direccion\")";
Debug.ShouldStop(67108864);
_cli.setField ("_direccion" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("direccion"))))));
 BA.debugLineNum = 60;BA.debugLine="cli.CorreoElectronico = map.Get(\"correoElectron";
Debug.ShouldStop(134217728);
_cli.setField ("_correoelectronico" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("correoElectronico"))))));
 BA.debugLineNum = 61;BA.debugLine="cli.Telefono = map.Get(\"telefono\")";
Debug.ShouldStop(268435456);
_cli.setField ("_telefono" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telefono"))))));
 BA.debugLineNum = 62;BA.debugLine="cli.TrabajoId = map.Get(\"trabajoId\")";
Debug.ShouldStop(536870912);
_cli.setField ("_trabajoid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("trabajoId"))))));
 BA.debugLineNum = 64;BA.debugLine="clien.Add(cli)";
Debug.ShouldStop(-2147483648);
_clien.runVoidMethod ("Add",(Object)((_cli)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 68;BA.debugLine="Return clien";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_clien));return;};
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static RemoteObject  _read_byid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (clientes) ","clientes",8,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "clientes","read_byid", __ref, _id);}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.clientes parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _id;
RemoteObject _cli = RemoteObject.declareNull("b4a.example.cliente");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (clientes) ","clientes",8,__ref.getField(false, "ba"),__ref,73);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 74;BA.debugLine="Dim cli As Cliente";
Debug.ShouldStop(512);
_cli = RemoteObject.createNew ("b4a.example.cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 75;BA.debugLine="cli.Initialize";
Debug.ShouldStop(1024);
_cli.runClassMethod (b4a.example.cliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 77;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(4096);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 78;BA.debugLine="apiJob.Download(apiURL & \"/\" & id)";
Debug.ShouldStop(8192);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 79;BA.debugLine="Wait For (apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "read_byid"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 80;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 81;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(65536);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 82;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(131072);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 83;BA.debugLine="cli.Id = map.Get(\"id\")";
Debug.ShouldStop(262144);
_cli.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 84;BA.debugLine="cli.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(524288);
_cli.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 85;BA.debugLine="cli.Apellido = map.Get(\"apellido\")";
Debug.ShouldStop(1048576);
_cli.setField ("_apellido" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("apellido"))))));
 BA.debugLineNum = 86;BA.debugLine="cli.Direccion = map.Get(\"direccion\")";
Debug.ShouldStop(2097152);
_cli.setField ("_direccion" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("direccion"))))));
 BA.debugLineNum = 87;BA.debugLine="cli.CorreoElectronico = map.Get(\"correoElectroni";
Debug.ShouldStop(4194304);
_cli.setField ("_correoelectronico" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("correoElectronico"))))));
 BA.debugLineNum = 88;BA.debugLine="cli.Telefono = map.Get(\"telefono\")";
Debug.ShouldStop(8388608);
_cli.setField ("_telefono" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telefono"))))));
 BA.debugLineNum = 89;BA.debugLine="cli.TrabajoId = map.Get(\"trabajoId\")";
Debug.ShouldStop(16777216);
_cli.setField ("_trabajoid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("trabajoId"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 91;BA.debugLine="Return cli";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_cli));return;};
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _apellido,RemoteObject _direccion,RemoteObject _correoelectronico,RemoteObject _telefono,RemoteObject _trabajoid) throws Exception{
try {
		Debug.PushSubsStack("Update (clientes) ","clientes",8,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "clientes","update", __ref, _id, _nombre, _apellido, _direccion, _correoelectronico, _telefono, _trabajoid);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_nombre,_apellido,_direccion,_correoelectronico,_telefono,_trabajoid);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.clientes parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _apellido,RemoteObject _direccion,RemoteObject _correoelectronico,RemoteObject _telefono,RemoteObject _trabajoid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._apellido = _apellido;
this._direccion = _direccion;
this._correoelectronico = _correoelectronico;
this._telefono = _telefono;
this._trabajoid = _trabajoid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _apellido;
RemoteObject _direccion;
RemoteObject _correoelectronico;
RemoteObject _telefono;
RemoteObject _trabajoid;
RemoteObject _cli = RemoteObject.declareNull("b4a.example.cliente");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (clientes) ","clientes",8,__ref.getField(false, "ba"),__ref,94);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("apellido", _apellido);
Debug.locals.put("direccion", _direccion);
Debug.locals.put("correoElectronico", _correoelectronico);
Debug.locals.put("telefono", _telefono);
Debug.locals.put("trabajoId", _trabajoid);
 BA.debugLineNum = 95;BA.debugLine="Dim cli As Cliente";
Debug.ShouldStop(1073741824);
_cli = RemoteObject.createNew ("b4a.example.cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 96;BA.debugLine="Dim json As String";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 98;BA.debugLine="cli.Initialize()";
Debug.ShouldStop(2);
_cli.runClassMethod (b4a.example.cliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 99;BA.debugLine="json = $\"{         \"id\": ${id},         \"nombre\":";
Debug.ShouldStop(4);
_json = (RemoteObject.concat(RemoteObject.createImmutable("{\n"),RemoteObject.createImmutable("        \"id\": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable(",\n"),RemoteObject.createImmutable("        \"nombre\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombre))),RemoteObject.createImmutable("\",\n"),RemoteObject.createImmutable("        \"apellido\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_apellido))),RemoteObject.createImmutable("\",\n"),RemoteObject.createImmutable("        \"direccion\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_direccion))),RemoteObject.createImmutable("\",\n"),RemoteObject.createImmutable("        \"correoElectronico\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_correoelectronico))),RemoteObject.createImmutable("\",\n"),RemoteObject.createImmutable("        \"telefono\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_telefono))),RemoteObject.createImmutable("\",\n"),RemoteObject.createImmutable("        \"trabajoId\": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_trabajoid))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("    }")));Debug.locals.put("json", _json);
 BA.debugLineNum = 109;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(4096);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 110;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
Debug.ShouldStop(8192);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json));
 BA.debugLineNum = 111;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(16384);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 113;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "update"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 114;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
}