IntStream.rangeClosed(1, 5).forEach(i -> System.out.println(i + " times 5 is " + (i * 5)));
// or in two lines
IntStream.rangeClosed(1, 5).forEach(
                i -> System.out.println(i + " times 5 is " + (i * 5)));
// 1 times 5 is 5
// 2 times 5 is 10
// 3 times 5 is 15
// 4 times 5 is 20
// 5 times 5 is 25