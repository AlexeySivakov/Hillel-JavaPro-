public class Replace {
    //какие предлоги есть в русском языке:
    // в, без, до, для, за, через, над, по, из, у, около, под, о, про, на, к, перед, при, с, между.
    // В, Без, До, Для, За, Через, Над, По, Из, У, Около, Под, О, Про, На, К, Перед, При, С, Между
    private final String Prepositions = "(?i)(\\b)" +
            "(в|без|до|для|за|через|над|по|из|у|около|под|о|про|на|к|перед|при|с|между|" +
            "В|Без|До|Для|За|Через|Над|По|Из|У|Около|Под|О|Про|На|К|Перед|При|С|Между)" +
            "(\\b|\\,|\\.)";
    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_RED = "\u001B[31m";
    String textTest;

    public String replace(String textLine) {
        textTest = textLine.replaceAll(Prepositions, "JAVA");
        return textTest;
    }

    public String replacePrint(String textLine) {
        textTest = textLine.replaceAll(Prepositions, ANSI_RED + "JAVA" + ANSI_RESET);
        return textTest;
    }
}
