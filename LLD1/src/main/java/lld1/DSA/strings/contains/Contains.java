package lld1.DSA.strings.contains;

public class Contains {
    public static void analyzeString(String filename,String prefix, String extension){
       boolean hasDot=filename.contains(".");
        System.out.println("CONTAINS DOT "+ hasDot);

        boolean startWithPrifix=filename.startsWith(prefix);
        System.out.println("start with "+prefix+" ? "+ startWithPrifix);

        boolean endsWith=filename.endsWith(".pdf");
        System.out.println("ENDS WITH "+ extension+" "+ extension);
        if (filename.endsWith(".pdf")) {
            System.out.println("PDF document");
        } else if (filename.endsWith(".jpg") || filename.endsWith(".png")) {
            System.out.println("Image file");
        } else if (filename.endsWith(".js")) {
            System.out.println("JavaScript file");
        } else if (filename.endsWith(".md")) {
            System.out.println("Markdown file");
        } else {
            System.out.println("Unknown file type");
        }

        System.out.println(); // Empty line between tests
    }

    public static void main(String[] args) {
        analyzeString("document.pdf", "doc", ".pdf");
        analyzeString("image.jpg", "img", ".png");
        analyzeString("script.js", "script", ".js");
        analyzeString("README.md", "read", ".md");
        analyzeString("myfile.txt", "my", ".txt");
        // Output:
// Contains dot? true
// Starts with 'doc'? true
// Ends with '.pdf'? true
// File type: PDF document
    }
}
