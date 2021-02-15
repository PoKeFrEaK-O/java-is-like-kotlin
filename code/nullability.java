// Annotations are used to provide supplement information about a program.
// Annotations start with ‘@’.
// Annotations do not change action of a compiled program.
// Annotations help to associate metadata (information) to the program elements i.e.
// instance variables, constructors, methods, classes, etc.
// Annotations are not pure comments as they can change the way a program is treated by compiler.

// Nullability Annotations:
@NonNull
@Nullable
// @Nullable and @NotNull annotations let you check nullability of a variable, parameter, or return value.
// The null-safety feature produces warnings at compile time.
// Such warnings may prevent catastrophic null pointer exceptions (NPEs) at runtime.

@NonNull
// Use this annotation to declare non-null constraint anywhere an object reference is expected:
// a field, a method parameter or a methods return value.

@Nullable
// Same as @NonNull, only with nullable instead of non-null.