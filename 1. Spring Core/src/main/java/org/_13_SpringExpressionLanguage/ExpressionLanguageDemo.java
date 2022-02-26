package org._13_SpringExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demoBean")
public class ExpressionLanguageDemo {
    @Value("#{(20*10)+20}")
    private int primitiveValueSet;
    @Value("#{(20*10)+20+T(java.lang.Math).PI}")
    private float staticVariableValueSet;
    @Value("#{(20*10)+20+T(java.lang.Math).sqrt(144)}")
    private int staticMethodValueSet;
    @Value("#{new String('Rakibul Hasan')}")
    private String objectCreateWithValue;
    @Value("#{(100 > 10) && (200 > 100)}")
    private boolean booleanValueSet;

    public ExpressionLanguageDemo(int primitiveValueSet, float staticVariableValueSet, int staticMethodValueSet, String objectCreateWithValue, boolean booleanValueSet) {
        this.primitiveValueSet = primitiveValueSet;
        this.staticVariableValueSet = staticVariableValueSet;
        this.staticMethodValueSet = staticMethodValueSet;
        this.objectCreateWithValue = objectCreateWithValue;
        this.booleanValueSet = booleanValueSet;
    }

    public ExpressionLanguageDemo() {
    }

    public int getPrimitiveValueSet() {
        return primitiveValueSet;
    }

    public void setPrimitiveValueSet(int primitiveValueSet) {
        this.primitiveValueSet = primitiveValueSet;
    }

    public float getStaticVariableValueSet() {
        return staticVariableValueSet;
    }

    public void setStaticVariableValueSet(float staticVariableValueSet) {
        this.staticVariableValueSet = staticVariableValueSet;
    }

    public int getStaticMethodValueSet() {
        return staticMethodValueSet;
    }

    public void setStaticMethodValueSet(int staticMethodValueSet) {
        this.staticMethodValueSet = staticMethodValueSet;
    }

    public String getObjectCreateWithValue() {
        return objectCreateWithValue;
    }

    public void setObjectCreateWithValue(String objectCreateWithValue) {
        this.objectCreateWithValue = objectCreateWithValue;
    }

    public boolean isBooleanValueSet() {
        return booleanValueSet;
    }

    public void setBooleanValueSet(boolean booleanValueSet) {
        this.booleanValueSet = booleanValueSet;
    }

    @Override
    public String toString() {
        return "ExpressionLanguageDemo{" +
                "primitiveValueSet=" + primitiveValueSet + "\n" +
                ", staticVariableValueSet=" + staticVariableValueSet + "\n" +
                ", staticMethodValueSet=" + staticMethodValueSet + "\n" +
                ", objectCreateWithValue='" + objectCreateWithValue + '\n' +
                ", objectCreateWithValue='" + booleanValueSet + '\n' +
                '}';
    }
}
