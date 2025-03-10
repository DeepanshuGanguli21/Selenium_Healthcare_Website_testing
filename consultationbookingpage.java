public static void testConsultationBooking(WebDriver driver) throws InterruptedException {
    driver.get("https://www.chennaigemhospital.in/"); 

    // Locate and interact with elements:
    // - Select department
    // - Select doctor
    // - Choose date and time
    // - Fill in patient details
    // - Submit the booking form

    // Assertions (using simple if-else checks):
    WebElement successMessage = driver.findElement(By.id("success-message")); // Replace with actual element ID
    if (successMessage.isDisplayed()) {
        System.out.println("Consultation booking successful!");
    } else {
        System.err.println("Consultation booking failed!");
    }
}
