# 0.3.0

## Changes

* Argument parsing changed from a word-based solution to a char-based one. This gives Arguments access to the
 previously omitted whitespace characters and allows the creation of Arguments who might not perfectly conform to
 words. The utility `SingleWordArgument`, `FixedLengthArgument` and `VariableLengthArgument` still exist for those
 who prefer a word-based solution.

## Additions

* Added `Argument#flatten` to flatten an `Argument<Either<T,T>, CONTEXT>` into a `Argument<T, CONTEXT>`.
* Introduced a `StateArgument` that aims to facilitate char-based Argument parsers.
* Added `QuotedArgument` which captures quoted Strings.
* Added `CodeBlockArgument` which captures Markdown code blocks. 

## Removals

* Arguments no longer provide an example field. They weren't used for anything currently will be reintroduced in
a later version in a way that allows the separation of program logic and presentation. 

## Versions

* Gradle 6.2.1 -> 6.6
* Kotlin 1.3.71 -> 1.4.0
* Kord 0.5.* -> 0.6.*
* Koin 2.1.5 -> 2.1.6
* kotlinx.coroutines 1.3.7 -> 1.3.9

# 0.2.0

## Changes

* Prefixes have been reworked considerably. #3

## Additions

* Added support for aliases
* You can now handle exceptions using the `ErrorHandler`.

#0.1.2

## Fixes

* Fixed an incorrect version range for Kord in kordx.commands.

#0.1.1

## Fixes

* Fixed an unescaped regex when enabling `enableMentionPrefix`
