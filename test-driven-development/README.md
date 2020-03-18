#Test Driven Development
TDD is a development of tests before a feature implementation

1. You read and understand requirements for a particular feature.
2. You develop a set of tests which check the feature. All of the tests are red, due to absence of the feature implementation.
3. You develop the feature until all tests become green.
4. Refactor the code.

https://technologyconversations.com/2013/12/24/test-driven-development-tdd-best-practices-using-java-examples-2/

## TDD life-cycle
1. Write the test
2. Run the test (there is no implementation code, test does not pass)
3. Write just enough implementation code to make the test pass
4. Run all tests (tests pass)
5. Refactor
6. Repeat

## Testing Frameworks
1. JUnit
2. Mockito
3. PowerMockito
4. DBUnit

## JUnit Testing Parts
1. Setup
2. Execution
3. Verification
4. Teardown

## JUnit Core Constructs
1. Annotations
   * @Test
2. Verification methods
   * org.junit.Assert.*
   * HamcrestMatcherAssert
3. @Before/@BeforeClass
4. @After/@AfterClass


