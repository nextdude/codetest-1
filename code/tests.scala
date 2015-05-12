object Tests {
    def helloWorldTest() {
        Assert.areEqual("Hello World!", Code.helloWorld());
    }
    def capitalizeEveryNthWordTest() {
        def sentence = "Lorem ipsum dolor sit amet";
        Assert.areEqual("Lorem ipsum Dolor sit Amet", Code.capitalizeEveryNthWord(sentence, 0, 2));
        Assert.areEqual("Lorem ipsum Dolor Sit Amet", Code.capitalizeEveryNthWord(sentence, 2, 1));
    }
    def isPrimeTest() {
        Assert.isFalse(Code.isPrime(-1), "IsPrime(-1) should be false.");
        Assert.isFalse(Code.isPrime(0), "IsPrime(0) should be false.");
        Assert.isFalse(Code.isPrime(1), "IsPrime(1) should be false.");
        Assert.isTrue(Code.isPrime(2), "IsPrime(2) should be true.");
        Assert.isTrue(Code.isPrime(5), "IsPrime(5) should be true.");
        Assert.isFalse(Code.isPrime(87), "IsPrime(87) should be false.");
        Assert.isTrue(Code.isPrime(97), "IsPrime(97) should be true.");
    }
}