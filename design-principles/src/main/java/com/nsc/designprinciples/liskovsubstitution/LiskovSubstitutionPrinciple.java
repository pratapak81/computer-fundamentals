package com.nsc.designprinciples.liskovsubstitution;

/**
 * Definition:
 * If S is a subtype of T, then objects of type T in a program may be replaces with objects of type S without modifying
 * the functionality of the program
 * <p>
 * NOTE:
 * 1. Type checking or casting is an example of violating Liskov Substitution Principle
 * 2. Make sure that a derived type can substitute its base type completely
 * 3. Keep base classes small and focused
 * 4. Keep interfaces lean
 * <p>
 * Summary:
 * 1. Don't think relationships in terms of "IS A"
 * 2. Empty methods, type checking and hardened preconditions are signs that you are violating the LSP
 * 3. LSP also applies for interfaces not just for class inheritance
 * <p>
 * SOLID Motivational Poster:
 * If it looks like a duck, quacks like a duck, but needs batteries - you probably have the wrong abstraction
 */
public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        SubContractor subContractor = new SubContractor();
        subContractor.approveSLA();
    }
}
