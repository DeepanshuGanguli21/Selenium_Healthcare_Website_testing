package com.hospital.tests;
import org.junit.Assert;
import org.junit.Test;
import com.hospital.pages.ConsultationPage;

public class ConsultationTest extends BaseTest {
    @Test
    public void testBookConsultation() {
        ConsultationPage consultation = new ConsultationPage(driver);
        consultation.bookConsultation("Dr. Smith", "10:00 AM");
        Assert.assertTrue(consultation.isBookingSuccessful());
    }
}
