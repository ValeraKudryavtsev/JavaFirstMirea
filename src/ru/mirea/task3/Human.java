package ru.mirea.task3;

public class Human {
    public static void main(String[] args) {
        Head head1 = new Head(true, 56);
        Head head2 = new Head(false);
        Head head3 = new Head(58);
        Head head4 = new Head();
        head2.setHeadSize(57);
        head3.setInjury(true);
        head4.setInjury(false);
        head4.setHeadSize(56);
        System.out.println("Данные о голове");
        System.out.println(head1.isInjury());
        System.out.println(head1.getHeadSize());
        System.out.println(head2.getHeadSize());
        System.out.println(head3.isInjury());
        System.out.println(head4.getHeadSize());

        Hand h1 = new Hand(true, 70, 35);
        Hand h2 = new Hand(false, 75);
        Hand h3 = new Hand(false);
        Hand h4 = new Hand();
        h2.setBicepsSize(40);
        h3.setHandLength(78);
        h3.setBicepsSize(42);
        h4.setInjury(false);
        h4.setHandLength(76);
        h4.setBicepsSize(39);
        System.out.println("\nДанные о руке");
        System.out.println(h1.isInjury());
        System.out.println(h2.isInjury());
        System.out.println(h3.getHandLength());
        System.out.println(h3.getBicepsSize());

        Leg l1 = new Leg(true, 90, 38);
        Leg l2 = new Leg(false, 115);
        Leg l3 = new Leg(false);
        Leg l4 = new Leg();
        l2.setLegSize(42);
        l3.setLegLength(90);
        l3.setLegSize(43);
        l4.setInjury(false);
        l4.setLegLength(92);
        l4.setLegSize(39);
        System.out.println("\nДанные о ноге");
        System.out.println(l1.isInjury());
        System.out.println(l2.isInjury());
        System.out.println(l3.getLegLength());
        System.out.println(l3.getLegSize());
    }
}
