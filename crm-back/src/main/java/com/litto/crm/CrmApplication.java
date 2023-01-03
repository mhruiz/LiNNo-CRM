package com.litto.crm;

import com.litto.crm.entity.ActivityEntity;
import com.litto.crm.entity.CompanyEntity;
import com.litto.crm.entity.ContactEntity;
import com.litto.crm.entity.DealEntity;
import com.litto.crm.service.activity.ActivityService;
import com.litto.crm.service.company.CompanyService;
import com.litto.crm.service.contact.ContactService;
import com.litto.crm.service.deal.DealService;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    CommandLineRunner run(ActivityService activityService, CompanyService companyService, ContactService contactService,
            DealService dealService) {
        return args -> {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2022, Calendar.JANUARY, 2);

            ActivityEntity activity = new ActivityEntity(null, "", calendar.getTime(), "");
            ActivityEntity activity2 = new ActivityEntity();
            ActivityEntity activity3 = new ActivityEntity();

            CompanyEntity solera = new CompanyEntity("Solera", "www.solera.com", "Avenida Palmeras 19B, 410014 Sevilla",
                    "Software", "https://media.glassdoor.com/sqll/42515/solera-squareLogo-1641391060257.png");

            calendar.set(2022, Calendar.DECEMBER, 28);
            ContactEntity carlos = new ContactEntity("Carlos", "Garcia", "carlos.garcia@solera.com",
                    "https://openseauserdata.com/files/055a91979264664a1ee12b9453610d82.png", "");
            ContactEntity miguel = new ContactEntity("Miguel", "Herrera", "miguel.herrera@solera.com", "", "");

            dealService
                    .create(new DealEntity("Google sold sub-company", new LocalDate(2022, 12,28), null, "", carlos, solera,
                            null));
        };
    }
}
