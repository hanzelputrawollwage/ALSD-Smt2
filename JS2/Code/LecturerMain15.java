public class LecturerMain15 {
    public static void main(String[] args) {
        Lecturer15 lctr1 = new Lecturer15();
        lctr1.lecturerID = "004123241";
        lctr1.name = "Dr. Lorem Ipsum S.T., M.T";
        lctr1.status = false;
        lctr1.startYear = 2014;
        lctr1.expertiseField = "Pancasila";

        lctr1.setStatus(true);
        lctr1.calculateTenure(2025);
        lctr1.changeExpertiseField("Data Base");
        lctr1.print();

        Lecturer15 lctr2 = new Lecturer15("00324213", "Andi Wijaya S.Kom., M.Kom.", true, 2009, "ALSD");
        lctr2.setStatus(false);
        lctr2.calculateTenure(2025);
        lctr2.changeExpertiseField("Data Base");
        lctr2.print();
    }
}
