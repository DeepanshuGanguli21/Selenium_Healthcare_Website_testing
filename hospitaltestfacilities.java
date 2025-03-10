public static void testFacilitiesNavigation(WebDriver driver) {
    driver.get("https://www.chennaigemhospital.in/facilities"); // Replace with the actual facilities page URL

    // Locate links to different facilities/departments

    // Click on each link and verify navigation to the correct page

    // Example:
    driver.findElement(By.linkText("Cardiology")).click(); // Replace with actual link text
    if (driver.getCurrentUrl().contains("cardiology")) { // Check if URL contains "cardiology"
        System.out.println("Cardiology navigation successful!");
    } else {
        System.err.println("Cardiology navigation failed!");
    }
}
