package android.support.v4.os;

import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* compiled from: ParcelableCompatHoneycombMR2 */
public class ParcelableCompatCreatorHoneycombMR2Stub {
    ParcelableCompatCreatorHoneycombMR2Stub() {
    }

    static <T> Parcelable.Creator<T> instantiate(ParcelableCompatCreatorCallbacks<T> callbacks) {
        return new ParcelableCompatCreatorHoneycombMR2(callbacks);
    }
}
