public static void main() {
    double[] qualifications = {18.5, 16.0, 19.2, 15.7, 18.5};
    String[] students = {"Ana", "Luis", "Maria", "Pedro", "Sofia"};
    int i = 0;
    int j = 0;
    for (i = 0; i < qualifications.length; i++) {
        for (j = i + 1; j < qualifications.length; j++) {
            if (qualifications[i] < qualifications[j]) {
                double qtemp = qualifications[i];
                qualifications[i] = qualifications[j];
                qualifications[j] = qtemp;
                String stemp = students[i];
                students[i] = students[j];
                students[j] = stemp;
            }
        }
    }
    System.out.println("Top de los tres alumnos");
    for (i = 0; i <= 4; i++) {
        System.out.println((i + 1) + ". " + students[i] + ": " + qualifications[i]);
    }
}