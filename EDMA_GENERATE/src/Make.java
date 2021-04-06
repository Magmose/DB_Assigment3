import org.abstractica.edma.generator.EdmaGenerator;

public class Make {
    public static void main(String[] args) {
        String projectDir = "C:\\Users\\mak.CONVERGENS\\Documents\\Skole\\EDMA\\Learn_EDMA";
        EdmaGenerator generator = new EdmaGenerator("LearnEDMA",
                projectDir + "/edmasrc",
                projectDir + "/src",
                "dk.mak.learnedma");
        generator.make();
    }
}
