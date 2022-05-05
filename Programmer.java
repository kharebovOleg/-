public class Programmer {
    String name;
    String company;
    String position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern ";
    }

    public String getPosition() {
        return position;
    }

    public void work() {
        switch (position) {
            case "intern " : position = "junior ";
            break;
            case "junior " : position = "middle";
            break;
            case "middle" : position = "senior";
            break;
            case "senior" : position = "lead";
            break;
            case "lead" :
                System.out.println("you are the best");
                break;
            default:
                System.out.println("error");
        }
    }
}
