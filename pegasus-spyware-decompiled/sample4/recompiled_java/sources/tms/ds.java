package tms;

import android.os.RemoteException;
import com.tencent.tmsecure.module.permission.IDummyService;
import com.tencent.tmsecure.module.permission.PermissionTableItem;
import tms.es;

/* access modifiers changed from: package-private */
public final class ds implements es.a {
    final /* synthetic */ PermissionTableItem a;
    final /* synthetic */ es b;

    ds(es esVar, PermissionTableItem permissionTableItem) {
        this.b = esVar;
        this.a = permissionTableItem;
    }

    @Override // tms.es.a
    public final void a() throws RemoteException {
    }

    @Override // tms.es.a
    public final void a(IDummyService iDummyService) throws RemoteException {
        iDummyService.removePermissionTableItem(this.a);
    }

    @Override // tms.es.a
    public final void b() throws RemoteException {
        this.b.g.removeItem(this.a);
    }
}
