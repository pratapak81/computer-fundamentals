package com.nsc.designprinciples.dependencyinversion;

import com.nsc.designprinciples.dependencyinversion.notifications.EmailSender;
import com.nsc.designprinciples.dependencyinversion.notifications.EmployeeNotifier;
import com.nsc.designprinciples.dependencyinversion.payment.PaymentProcessor;

/**
 * DIP:
 * 1. High level modules should not depend on low level modules; both should depend on abstractions
 * 2. Abstractions should not depend on details. Details should depend on abstraction.
 * <p>
 * Low Level Modules eg:
 * Logging, Data access, Network communication, IO
 * <p>
 * Dependency Injection (DI):
 * A technique that allows the creation of dependent objects outside of a class and provides those objects to a class.
 * <p>
 * Inversion of Control (IoC):
 * Inversion of Control is a design principle in which the control of object creation, configuration, and life cycle is
 * passed to a container or framework
 * <p>
 * IoC container Benefits:
 * 1. Makes it easy to switch between different implementations at runtime
 * 2. Increased program modularity
 * 3. Manages the lifecycle of objects and their configuration
 * <p>
 * Spring IoC Container (XML, Configuration class, Annotation)
 */
public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        EmployeeNotifier employeeNotifier = new EmailSender();
        EmployeeRepo employeeRepo = new EmployeeList();

        PaymentProcessor paymentProcessor = new PaymentProcessor(employeeRepo, employeeNotifier);
        paymentProcessor.sendPayments();
    }
}
