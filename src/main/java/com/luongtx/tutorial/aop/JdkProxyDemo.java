package com.luongtx.tutorial.aop;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyDemo {
    JdkProxyDemo() {
        System.out.println("Calling constructor");
    }

    interface If {
        void originalMethod(String s);
    }

    static class Original implements If {
        public void originalMethod(String s) {
            System.out.println(s);
        }
    }

    static class Handler implements InvocationHandler {
        private final If original;

        public Handler(If original) {
            this.original = original;
        }

        public Object invoke(Object proxy, Method method, Object[] args)
                throws IllegalAccessException, IllegalArgumentException,
                InvocationTargetException {
            long startTime = System.currentTimeMillis();
            System.out.println("BEFORE");
            method.invoke(original, args);
            System.out.println("AFTER");
            long elapseTime = System.currentTimeMillis() - startTime;
            System.out.printf("Elapsed time: %s", elapseTime);
            return null;
        }
    }

    public static void main(String[] args) {
        Original original = new Original();
        Handler handler = new Handler(original);
        If f = (If) Proxy.newProxyInstance(If.class.getClassLoader(),
                new Class[]{If.class},
                handler);
        f.originalMethod("Hallo");
//        original.originalMethod("Hallo");
    }
}
