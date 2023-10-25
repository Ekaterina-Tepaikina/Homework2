public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        var weight1 = 78.2;
        var weight2 = 82.7;
        var totalWeight = weight1 + weight2;
        System.out.println("Общий вес: "+totalWeight+" кг");
        var weightDifference = weight2 - weight1;
        System.out.println("Разница в весе: "+weightDifference+" кг");

        //Задача 7
        weightDifference = weight2 - weight1;
        System.out.println("Разница в весе (вычитание): "+weightDifference+" кг");
        weightDifference = weight2 % weight1;
        System.out.println("Разница в весе (остаток от деления): "+weightDifference+" кг");

        //Задача 8
        var totalTime = 640;
        var employeNumber = totalTime/8;
        System.out.println("Всего работников в компании — "+employeNumber+" человек");
        employeNumber = employeNumber+94;
        totalTime = employeNumber*8;
        System.out.println("Если в компании работает "+employeNumber+" человека, то всего "+totalTime+" часа работы может быть поделено между сотрудниками");
    }
}