
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xtrabajos {
    public static RemoteObject myClass;
	public b4xtrabajos() {
	}
    public static PCBA staticBA = new PCBA(null, b4xtrabajos.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _txtid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtnombretrabajo = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _apiclas = RemoteObject.declareNull("b4a.example.trabajos");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"apiClas",_ref.getField(false, "_apiclas"),"Root",_ref.getField(false, "_root"),"txtId",_ref.getField(false, "_txtid"),"txtNombreTrabajo",_ref.getField(false, "_txtnombretrabajo"),"xui",_ref.getField(false, "_xui")};
}
}