public static void testDoctorDetails(WebDriver driver) {
    driver.get("https://www.chennaigemhospital.in/doctors"); // Replace with the actual doctors' page URL

    // Locate doctor elements
    // Extract details (name, specialization, etc.)
    // Verify the extracted details against expected values (you'll need to define these)

    // Example assertion:
    String doctorName = driver.findElement(By.cssSelector(".doctor-name")).getText(); // Replace with actual selector
    if (doctorName.equals("Dr. Example Name")) {
        System.out.println("Doctor name verified!");
    } else {
        System.err.println("Doctor name verification failed!");
    }
}
