package com.elsonkhoza.sealed;

/**
 * A sealed class must have child class.
 * The child class must be final, sealed, or non-sealed.
 * Sealed classes or interfaces prevent other classes that are not permitted
 * from extending/implementing impl the class.
 * @sealed modifier seals the class.
 * @permits keyword specified the classes that are allowed to extend the sealed class.
 *
 * @author Elson Khoza
 */
public abstract sealed class Shape permits Triangle, Circle {
}
