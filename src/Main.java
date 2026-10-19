void main() {
    int score = 100;
    IO.println("score " + score);
    byte age = 29;
    IO.println("Age" + age);
    short year = 2025;
    IO.println("year" + year);
    double celcen = 5.5;
    IO.println("celcen" + celcen);

    StringBuffer sb = new StringBuffer();
    IO.println("kamlesh capacity is " +sb.capacity());
    IO.println("kamlesh capacity is " +sb.append("hello"));
    IO.println("kamlesh length is " +sb.length());
    IO.println("kamlesh capacity is " +sb.append(" hello"));
    IO.println("kamlesh capacity is " +sb.append(" hello"));
    IO.println("kamlesh capacity is " +sb.append(" hello"));
    IO.println("kamlesh capacity is " +sb.capacity());
   int[] number = new int[5];
    IO.println("Array is " + number[1]);
    int[] number2 = {1,2, 3,4,5,6,7};
    IO.println("Array is " + number2[1]);
//    IO.println("Array is " + number2[10]);
    IO.println("Array is " + number2);
    IO.println("Array is " + number2.length);
    IO.println("Array is " + Arrays.toString(number2));
}
