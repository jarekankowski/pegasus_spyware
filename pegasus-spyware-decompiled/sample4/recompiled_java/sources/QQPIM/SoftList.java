package QQPIM;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import java.util.ArrayList;
import java.util.Collection;

public final class SoftList extends JceStruct {
    static ArrayList<SoftElementInfo> a;
    static final /* synthetic */ boolean b = (!SoftList.class.desiredAssertionStatus());
    public ArrayList<SoftElementInfo> vctSofts;

    public SoftList() {
        this.vctSofts = null;
        this.vctSofts = this.vctSofts;
    }

    public SoftList(ArrayList<SoftElementInfo> arrayList) {
        this.vctSofts = null;
        this.vctSofts = arrayList;
    }

    public final String className() {
        return "QQPIM.SoftList";
    }

    @Override // java.lang.Object
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            if (b) {
                return null;
            }
            throw new AssertionError();
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public final void display(StringBuilder sb, int i) {
        new JceDisplayer(sb, i).display((Collection) this.vctSofts, "vctSofts");
    }

    public final boolean equals(Object obj) {
        return JceUtil.equals(this.vctSofts, ((SoftList) obj).vctSofts);
    }

    public final ArrayList<SoftElementInfo> getVctSofts() {
        return this.vctSofts;
    }

    @Override // com.qq.taf.jce.JceStruct
    public final void readFrom(JceInputStream jceInputStream) {
        if (a == null) {
            a = new ArrayList<>();
            a.add(new SoftElementInfo());
        }
        setVctSofts((ArrayList) jceInputStream.read((Object) a, 0, true));
    }

    public final void setVctSofts(ArrayList<SoftElementInfo> arrayList) {
        this.vctSofts = arrayList;
    }

    @Override // com.qq.taf.jce.JceStruct
    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write((Collection) this.vctSofts, 0);
    }
}
