
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cliente {
    public static RemoteObject myClass;
	public cliente() {
	}
    public static PCBA staticBA = new PCBA(null, cliente.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _nombre = RemoteObject.createImmutable("");
public static RemoteObject _apellido = RemoteObject.createImmutable("");
public static RemoteObject _direccion = RemoteObject.createImmutable("");
public static RemoteObject _correoelectronico = RemoteObject.createImmutable("");
public static RemoteObject _telefono = RemoteObject.createImmutable("");
public static RemoteObject _trabajoid = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Apellido",_ref.getField(false, "_apellido"),"CorreoElectronico",_ref.getField(false, "_correoelectronico"),"Direccion",_ref.getField(false, "_direccion"),"Id",_ref.getField(false, "_id"),"Nombre",_ref.getField(false, "_nombre"),"Telefono",_ref.getField(false, "_telefono"),"TrabajoId",_ref.getField(false, "_trabajoid")};
}
}