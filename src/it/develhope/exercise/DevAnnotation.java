package it.develhope.exercise;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Ho creato una annotation custom chiamata DevAnnotation a cui ho dato due variabili, devName e devSurname.
 * Ho aggiunto la Retention a RunTime
 * Ho aggiunto che il target fossero i metodi
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DevAnnotation {

    String devName();
    String devSurname();
}
