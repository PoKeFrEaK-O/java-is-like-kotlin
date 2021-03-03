doctype

html
  head
    title "Java is like Kotlin"
    meta (:charset utf-8)
    link (:rel icon)
      :href http://logo.cirru.org/cirru-32x32.png
      :type image/png
    link (:rel stylesheet)
      :href https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.11.0/styles/github.min.css
    style (@insert css/style.css)
    script (:src https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.11.0/highlight.min.js)
    script (:src https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.11.0/languages/go.min.js)
    script (:src https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.11.0/languages/swift.min.js)
    script (:defer true) "hljs.initHighlightingOnLoad();"

  body
    a (:target _blank)
      :href https://github.com/kibotu/java-is-like-kotlin
      img#fork-me (:src http://kibotu.github.io/java-is-like-kotlin/fork-me.png)
    #note
      = "Java is like Kotlin"

    .section
      .title BASICS
      .case (.name "Hello World") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/hello-world.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/hello-world.kt)
      .case (.name "Variables And Constants") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/variables-and-constants.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/variables-and-constants.kt)
      .case (.name "Integer (Wrapper Class) vs int (Primitive Data Type)") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/Integer-vs-int.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/Integer-vs-int.kt)
      .case (.name "Annotations") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/annotations.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/annotations.kt)
      .case (.name "Nullability") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/nullability.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/nullability.kt)
      .case (.name "Explicit Types") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/explicit-types.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/explicit-types.kt)
      .case (.name "Type Coercion") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/type-coercion.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/type-coercion.kt)
      .case (.name "String Interpolation") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/string-interpolation.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/string-interpolation.kt)
      .case (.name "Range Operator") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/range-operator.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/range-operator.kt)
      .case (.name "Inclusive Range Operator") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/inclusive-range-operator.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/inclusive-range-operator.kt)

    .section
      .title "Conditions and Loops"
      .case (.name "while-loops") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/while.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/while.kt)
      .case (.name "for-loops") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/for.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/for.kt)
      .case (.name "break") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/break.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/break.kt)
      .case (.name "continue") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/continue.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/continue.kt)
      .case (.name "for-each-loops") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/foreach.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/foreach.kt)
      .case (.name "if-expression") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/if.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/if.kt)
      .case (.name "switch/when") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/switch.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/when.kt)

    .section
      .title "Collections"
      .case (.name "Arrays") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/arrays.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/arrays.kt)
      .case (.name "Listen") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/listen.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/listen.kt)
      .case (.name "Maps") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/maps.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/maps.kt)
      .case (.name "Empty Collections") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/empty-collections.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/empty-collections.kt)
      .case (.name "Quantities") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/quantities.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/quantities.kt)

    .section
      .title "Combining multiple collections."
      .case (.name "Combination of A and B") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/Combination_of_A_and_B.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/Combination_of_A_and_B.kt)
      .case (.name "Union of A and B") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/Union_of_A_and_B.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/Union_of_A_and_B.kt)
      .case (.name "Intersection of A and B") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/Intersection_of_A_and_B.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/Intersection_of_A_and_B.kt)
      .case (.name "Symmetric difference of A and B") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/Symmetric_difference_of_A_and_B.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/Symmetric_difference_of_A_and_B.kt)
      .case (.name "Relative complement of A and B") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/Relative_complement_of_A_and_B.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/Relative_complement_of_A_and_B.kt)

    .section
      .title FUNCTIONS
      .case (.name "Parameters") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/parameters.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/parameters.kt)
      .case (.name "Default arguments") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/default_arguments.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/default_arguments.kt)

    .section
      .title FUNCTIONS
      .case (.name "Functions") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/functions.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/functions.kt)
      .case (.name "Functions") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/functions_2.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/functions_2.kt)
      .case (.name "Tuple Return") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/tuple-return.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/tuple-return.kt)
      .case (.name "Variable Number Of Arguments") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/variable-number-of-arguments.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/variable-number-of-arguments.kt)
      .case (.name "Function Type") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/function-type.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/function-type.kt)
      .case (.name "Map") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/map.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/map.kt)
      .case (.name "Sort") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/sort.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/sort.kt)
      .case (.name "Named Arguments") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/named-arguments.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/named-arguments.kt)

    .section
      .title CLASSES
      .case (.name "Declaration") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/declaration.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/declaration.kt)
      .case (.name "Usage") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/usage.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/usage.kt)
      .case (.name "Subclass") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/subclass.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/subclass.kt)
      .case (.name "Checking Type") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/checking-type.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/checking-type.kt)
      .case (.name "Pattern Matching") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/pattern-matching.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/pattern-matching.kt)
      .case (.name "Downcasting") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/downcasting.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/downcasting.kt)
      .case (.name "Protocol") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/protocol.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/protocol.kt)
      .case (.name "Extensions") $ .pair
        .card (.lang Java) $ pre.code $ code (@insert code/extensions.java)
        .card (.lang Kotlin) $ pre.code $ code (@insert code/extensions.kt)
