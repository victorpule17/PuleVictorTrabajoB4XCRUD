package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clientes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.clientes");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.clientes.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
public b4a.example.httpjob _apijob = null;
public String _apiurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.clientes __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub Initialize(url As String)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="apiURL = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.clientes __ref,int _id,String _nombre,String _apellido,String _direccion,String _correoelectronico,String _telefono,int _trabajoid) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_nombre,_apellido,_direccion,_correoelectronico,_telefono,_trabajoid}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_nombre,_apellido,_direccion,_correoelectronico,_telefono,_trabajoid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.clientes parent,b4a.example.clientes __ref,int _id,String _nombre,String _apellido,String _direccion,String _correoelectronico,String _telefono,int _trabajoid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._apellido = _apellido;
this._direccion = _direccion;
this._correoelectronico = _correoelectronico;
this._telefono = _telefono;
this._trabajoid = _trabajoid;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
int _id;
String _nombre;
String _apellido;
String _direccion;
String _correoelectronico;
String _telefono;
int _trabajoid;
b4a.example.cliente _cli = null;
String _json = "";
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim cli As Cliente";
_cli = new b4a.example.cliente();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="cli.Initialize()";
_cli._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="json = $\"{         \"id\": ${id},         \"nombre\":";
_json = ("{\n"+"        \"id\": "+parent.__c.SmartStringFormatter("",(Object)(_id))+",\n"+"        \"nombre\": \""+parent.__c.SmartStringFormatter("",(Object)(_nombre))+"\",\n"+"        \"apellido\": \""+parent.__c.SmartStringFormatter("",(Object)(_apellido))+"\",\n"+"        \"direccion\": \""+parent.__c.SmartStringFormatter("",(Object)(_direccion))+"\",\n"+"        \"correoElectronico\": \""+parent.__c.SmartStringFormatter("",(Object)(_correoelectronico))+"\",\n"+"        \"telefono\": \""+parent.__c.SmartStringFormatter("",(Object)(_telefono))+"\",\n"+"        \"trabajoId\": "+parent.__c.SmartStringFormatter("",(Object)(_trabajoid))+"\n"+"    }");
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "update"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2555924;
 //BA.debugLineNum = 2555924;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=2555925;
 //BA.debugLineNum = 2555925;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.clientes __ref,int _id,String _nombre,String _apellido,String _direccion,String _correoelectronico,String _telefono,int _trabajoid) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_id,_nombre,_apellido,_direccion,_correoelectronico,_telefono,_trabajoid}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_id,_nombre,_apellido,_direccion,_correoelectronico,_telefono,_trabajoid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.clientes parent,b4a.example.clientes __ref,int _id,String _nombre,String _apellido,String _direccion,String _correoelectronico,String _telefono,int _trabajoid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._apellido = _apellido;
this._direccion = _direccion;
this._correoelectronico = _correoelectronico;
this._telefono = _telefono;
this._trabajoid = _trabajoid;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
int _id;
String _nombre;
String _apellido;
String _direccion;
String _correoelectronico;
String _telefono;
int _trabajoid;
b4a.example.cliente _clie = null;
String _json = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim clie As Cliente";
_clie = new b4a.example.cliente();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="clie.Initialize()";
_clie._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="json = \"{'id': \" & id & \", 'nombre': '\" & nombre";
_json = "{'id': "+BA.NumberToString(_id)+", 'nombre': '"+_nombre+"', 'apellido': '"+_apellido+"', 'direccion': '"+_direccion+"', 'correoElectronico': '"+_correoelectronico+"', 'telefono': '"+_telefono+"', 'trabajoId': '"+BA.NumberToString(_trabajoid)+"'}";
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="apiJob.PostString(apiURL, json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "create"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="data = jsonParser.NextObject";
_data = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="clie.Id = data.Get(\"id\")";
_clie._id /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("id"))));
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="clie.Nombre = data.Get(\"nombre\")";
_clie._nombre /*String*/  = BA.ObjectToString(_data.Get((Object)("nombre")));
RDebugUtils.currentLine=2359313;
 //BA.debugLineNum = 2359313;BA.debugLine="clie.Apellido = data.Get(\"apellido\")";
_clie._apellido /*String*/  = BA.ObjectToString(_data.Get((Object)("apellido")));
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="clie.Direccion = data.Get(\"direccion\")";
_clie._direccion /*String*/  = BA.ObjectToString(_data.Get((Object)("direccion")));
RDebugUtils.currentLine=2359315;
 //BA.debugLineNum = 2359315;BA.debugLine="clie.CorreoElectronico = data.Get(\"correoElectro";
_clie._correoelectronico /*String*/  = BA.ObjectToString(_data.Get((Object)("correoElectronico")));
RDebugUtils.currentLine=2359316;
 //BA.debugLineNum = 2359316;BA.debugLine="clie.Telefono = data.Get(\"telefono\")";
_clie._telefono /*String*/  = BA.ObjectToString(_data.Get((Object)("telefono")));
RDebugUtils.currentLine=2359317;
 //BA.debugLineNum = 2359317;BA.debugLine="clie.TrabajoId = data.Get(\"trabajoId\")";
_clie._trabajoid /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("trabajoId"))));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=2359319;
 //BA.debugLineNum = 2359319;BA.debugLine="Return clie";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_clie));return;};
RDebugUtils.currentLine=2359320;
 //BA.debugLineNum = 2359320;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.clientes __ref,int _id) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.clientes parent,b4a.example.clientes __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "delete"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_byid(b4a.example.clientes __ref,int _id) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.clientes parent,b4a.example.clientes __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
int _id;
b4a.example.cliente _cli = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim cli As Cliente";
_cli = new b4a.example.cliente();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="cli.Initialize";
_cli._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="apiJob.Download(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Wait For (apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "read_byid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="cli.Id = map.Get(\"id\")";
_cli._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="cli.Nombre = map.Get(\"nombre\")";
_cli._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="cli.Apellido = map.Get(\"apellido\")";
_cli._apellido /*String*/  = BA.ObjectToString(_map.Get((Object)("apellido")));
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="cli.Direccion = map.Get(\"direccion\")";
_cli._direccion /*String*/  = BA.ObjectToString(_map.Get((Object)("direccion")));
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="cli.CorreoElectronico = map.Get(\"correoElectroni";
_cli._correoelectronico /*String*/  = BA.ObjectToString(_map.Get((Object)("correoElectronico")));
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="cli.Telefono = map.Get(\"telefono\")";
_cli._telefono /*String*/  = BA.ObjectToString(_map.Get((Object)("telefono")));
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="cli.TrabajoId = map.Get(\"trabajoId\")";
_cli._trabajoid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("trabajoId"))));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=2490386;
 //BA.debugLineNum = 2490386;BA.debugLine="Return cli";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_cli));return;};
RDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.clientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientes";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Private apiJob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Public apiURL As String";
_apiurl = "";
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_all(b4a.example.clientes __ref) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_all", null));}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.clientes parent,b4a.example.clientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
anywheresoftware.b4a.objects.collections.List _clien = null;
b4a.example.cliente _cli = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
b4a.example.httpjob _resultado = null;
int _i = 0;
int step12;
int limit12;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim clien As List";
_clien = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Dim cli As Cliente";
_cli = new b4a.example.cliente();
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="clien.Initialize";
_clien.Initialize();
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="apiJob.Download(apiURL)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ );
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "read_all"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="lst = jsonParser.NextArray";
_lst = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="For i = 0 To lst.Size - 1";
if (true) break;

case 4:
//for
this.state = 7;
step12 = 1;
limit12 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="map = lst.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lst.Get(_i)));
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="cli.Initialize";
_cli._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="cli.Id = map.Get(\"id\")";
_cli._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="cli.Nombre = map.Get(\"nombre\")";
_cli._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="cli.Apellido = map.Get(\"apellido\")";
_cli._apellido /*String*/  = BA.ObjectToString(_map.Get((Object)("apellido")));
RDebugUtils.currentLine=2424852;
 //BA.debugLineNum = 2424852;BA.debugLine="cli.Direccion = map.Get(\"direccion\")";
_cli._direccion /*String*/  = BA.ObjectToString(_map.Get((Object)("direccion")));
RDebugUtils.currentLine=2424853;
 //BA.debugLineNum = 2424853;BA.debugLine="cli.CorreoElectronico = map.Get(\"correoElectron";
_cli._correoelectronico /*String*/  = BA.ObjectToString(_map.Get((Object)("correoElectronico")));
RDebugUtils.currentLine=2424854;
 //BA.debugLineNum = 2424854;BA.debugLine="cli.Telefono = map.Get(\"telefono\")";
_cli._telefono /*String*/  = BA.ObjectToString(_map.Get((Object)("telefono")));
RDebugUtils.currentLine=2424855;
 //BA.debugLineNum = 2424855;BA.debugLine="cli.TrabajoId = map.Get(\"trabajoId\")";
_cli._trabajoid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("trabajoId"))));
RDebugUtils.currentLine=2424857;
 //BA.debugLineNum = 2424857;BA.debugLine="clien.Add(cli)";
_clien.Add((Object)(_cli));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=2424861;
 //BA.debugLineNum = 2424861;BA.debugLine="Return clien";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_clien));return;};
RDebugUtils.currentLine=2424862;
 //BA.debugLineNum = 2424862;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}