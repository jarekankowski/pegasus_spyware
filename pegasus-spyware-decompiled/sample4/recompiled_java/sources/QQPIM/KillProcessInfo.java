package QQPIM;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;

public final class KillProcessInfo extends JceStruct implements Cloneable {
    static final /* synthetic */ boolean a = (!KillProcessInfo.class.desiredAssertionStatus());
    public String process;

    public KillProcessInfo() {
        this.process = "";
        this.process = this.process;
    }

    public KillProcessInfo(String str) {
        this.process = "";
        this.process = str;
    }

    public final String className() {
        return "QQPIM.KillProcessInfo";
    }

    @Override // java.lang.Object
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            if (a) {
                return null;
            }
            throw new AssertionError();
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public final void display(StringBuilder sb, int i) {
        new JceDisplayer(sb, i).display(this.process, "process");
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return JceUtil.equals(this.process, ((KillProcessInfo) obj).process);
    }

    public final String fullClassName() {
        return "QQPIM.KillProcessInfo";
    }

    public final String getProcess() {
        return this.process;
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public final void readFrom(JceInputStream jceInputStream) {
        this.process = jceInputStream.readString(0, true);
    }

    public final void setProcess(String str) {
        this.process = str;
    }

    @Override // com.qq.taf.jce.JceStruct
    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.process, 0);
    }
}
