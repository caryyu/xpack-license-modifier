package com.github.caryyu.xpacklicensemodifier;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

public class Main {
    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        pool.insertClassPath(args[0]);
        CtClass licenseClazz = pool.get("org.elasticsearch.license.License$Builder");

        CtMethod m1 = licenseClazz.getDeclaredMethod("expiryDate");
        CtMethod m2 = licenseClazz.getDeclaredMethod("type");

        m1.insertBefore("{if(true) this.expiryDate = 4070880000000L; return this;}");
        m2.insertBefore("{if(true) this.type = \"platinum\"; return this;}");

        licenseClazz.writeFile();
    }
}