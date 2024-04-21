public class swimmingPoolProgram {
    public static void main(String[] args) {


        Pool como = new Pool("Como Park", 25);
        Pool ymca = new Pool("YMCA Downtown", 20);
        Pool Edina = new Pool("Edina Downtown", 50);

        double totalDistance = como.distanceForLaps(5);
        System.out.println(totalDistance);

        double TotalDistance = Edina.distanceForLaps(2);
        System.out.println(TotalDistance);

        System.out.println(ymca);
    }

}
