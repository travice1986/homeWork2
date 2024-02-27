public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var  paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7369;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxers = (boxer2 + boxer1)/2;
        System.out.println(boxers);
        var boxersOut = boxer2 - boxer1;
        System.out.println(boxersOut);
        var boxerMod = boxer2 % boxer1;
        System.out.println(boxerMod);

        var workers = 640 / 8;
        System.out.println("Всего работников в компании — " + workers + " человек");

        var workersNew = workers + 94;
        var hours = workersNew * 8;
        System.out.println("Если в компании работает " + workersNew + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");


    }
}