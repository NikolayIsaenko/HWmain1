public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int apple = 3;
        System.out.println("В коробке лежит " + apple + " кг яблок!");
        byte bananas = 17;
        System.out.println("В коробке лежит " + bananas + " кг бананов!");
        short pencil = 27976;
        System.out.println("На складе находятся " + pencil + " тонн карандашей!");
        long road = 23523463655L;
        System.out.println("Дорога от Москвы до Воронежа составляет " + road + " км!");
        Float sugar = 1.5f;
        System.out.println(" В мешке находится " + sugar + " кг сахара");
        double numberP = 3.1415926535;
        System.out.println(" Число ПИ = " + numberP);

        float number1 = 27.12f;
        System.out.println(number1);
        long number2 = 987678965549l;
        System.out.println(number2);
        double number3 = 2.786;
        System.out.println(number3);
        int number4 = 569;
        System.out.println(number4);
        short number5 = -159;
        System.out.println(number5);
        short number6 = 27897;
        System.out.println(number6);
        byte number7 = 67;
        System.out.println(number7);

        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        int students = teacher1 + teacher2 + teacher3;
        System.out.println(students);
        short papers = 480;
        int papersOnOneStudent = (papers / students);
        System.out.println(" На каждого ученика рассчитано по " + papersOnOneStudent + " листов бумаги");

        byte bottleForOneMinute = 8;
        int bottle20Minuts = (bottleForOneMinute * 20);
        System.out.println(" За 20 минут машина произвела " + bottle20Minuts + " бутылок");

        int bottleOneDay = (bottleForOneMinute * 1440);
        System.out.println( " За сутки машина произвела " + bottleOneDay + " бутылок");

        int bottle3Days = (bottleOneDay * 4320);
        System.out.println(" За 3 дня машина произвела " + bottle3Days + " бутылок");

        long bottleOneMonth = (bottleOneDay * 43200l);
        System.out.println( " За один месяц машина произвела " + bottleOneMonth + " бутылок");

        byte cansOfPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classes = cansOfPaint / ( whitePaint + brownPaint);
        int allWhitePaint = ( whitePaint * classes);
        int allBrownPaint = ( brownPaint * classes);
        System.out.println( " В школе, где всего " + classes + " классов, нужно по " + allWhitePaint + " банок белой краски и по " + allBrownPaint + " банок коричневой краски");

        byte wеightOneBanana = 80;
        byte wеightMilk = 105;
        byte weightIcecream = 100;
        byte weightOneEgg = 70;

        int allBananas = (wеightOneBanana * 5);
        int milk = (wеightMilk * 2);
        int icecream = (weightIcecream * 2);
        int eggs = (weightOneEgg * 4);

        int breakfast = ( allBananas + milk + icecream + eggs);
        System.out.println(" Завтрак чемпиона весит - " + breakfast + " грамм");
        float breakfastKg = ( breakfast / 1000f );
        System.out.println(" Завтрак чемпиона весит - " + breakfastKg + " килограмм");

        short weight1 = 250;
        short weight2 = 500;
        int slowWeight = ( 7000 / weight1);
        System.out.println( " Если спортсмен будет худеть каждый день по " + weight1 + " грамм, то он похудеет на 7 кг за " + slowWeight + " дней");
        int fastWeight = ( 7000 / weight2);
        System.out.println( " Если спортсмен будет худеть каждый день по " + weight2 + " грамм, то он похудеет на 7 кг за " + fastWeight + " дней");

        float weight3 = ((weight1 + weight2) / 2f);
        float averageWeight = ( 7000 / weight3);
        System.out.println( " Если спортсмен будет худеть каждый день по " + weight3 + " грамм, то он похудеет на 7 кг за " + averageWeight + " дней");

        int employee1 = 67760;
        float employeeMasha =( ((employee1 / 100f) * 10) + employee1 );
        int annualIncomeMasha1 = employee1 * 12;
        float annualIncomeMasha2 = employeeMasha * 12f;
        float annualIncomeMasha3 = annualIncomeMasha2 - annualIncomeMasha1;
        System.out.println( " Маша теперь получает - " + employeeMasha + " рублей в месяц. Годовой доход вырос на - " + annualIncomeMasha3 + " рублей" );

        int employee2 = 83690;
        float employeeDenis =( ((employee2 / 100f) * 10) + employee2 );
        int annualIncomeDenis1 = employee2 * 12;
        float annualIncomeDenis2 = employeeDenis * 12f;
        float annualIncomeDenis3 = annualIncomeDenis2 - annualIncomeDenis1;
        System.out.println( " Денис теперь получает - " + employeeDenis + " рублей в месяц. Годовой доход вырос на - " + annualIncomeDenis3 + " рублей" );

        int employee3 = 76230;
        float employeeKris =( ((employee3 / 100f) * 10) + employee3 );
        int annualIncomeKris1 = employee3 * 12;
        float annualIncomeKris2 = employeeKris * 12f;
        float annualIncomeKris3 = annualIncomeKris2 - annualIncomeKris1;
        System.out.println( " Кристина теперь получает - " + employeeKris + " рублей в месяц. Годовой доход вырос на - " + annualIncomeKris3 + " рублей" );




































    }
}