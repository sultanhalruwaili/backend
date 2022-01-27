package com.example.lawyers.model.Config;
import com.example.lawyers.model.Entities.Lawyers;
import com.example.lawyers.model.Repository.LawyersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class LawyersConfig {


    // Bean definition is the objects that form the backbone of your application and that are managed by the Spring IoC container
    @Bean
    CommandLineRunner commandLineRunner2(LawyersRepository repository){
        return args -> {
            Lawyers ahmad = new Lawyers(
                    1,
                    "ahmad alshammari",
                    "https://media.istockphoto.com/photos/portrait-of-a-business-man-outdoors-picture-id639115088?k=20&m=639115088&s=612x612&w=0&h=vmXB-x8N65wr9PGRcWhqAzxamFM3Tb00sxl50Zo4wvk=",
                    "Solutions",
                    "5-Nov-1999",
                    "ahamd123@gmail.com",
                    9000190,
                    "Sakaka"
            );
            Lawyers Sami = new Lawyers(
                    2,
                    "Sami Sultan",
                    "https://www.iberianlawyer.com/images/Andr%C3%A9s%20Ruiz%20perez%20(foto%20grande).jpg",
                    "Solutions",
                    "9-Jon-1998",
                    "nasser123@gmail.com",
                    899990,
                    "Ryadh"
            );
            Lawyers Maram = new Lawyers(
                    3,
                    "Ahmad Alarsan",
                    "https://jobs.thelawyer.com/getasset/062835e6-035a-472e-a80a-57e2f0b798b6/",
                    "Solutions",
                    "9-Jon-1998",
                    "Ahamd123@gmail.com",
                    899990,
                    "qara"
            );
            Lawyers Naif = new Lawyers(
                    4,
                    "Naif alruwaili",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkNzhm56EbY38pVkvx8ASK3waeU2Z7bXJP3NbOO5ekLoSrFF3DQ4FBTvEc0FgmJKUl1Tc&usqp=CAU",
                    "Arbitration",
                    "9-Jon-1998",
                    "naif123@gmail.com",
                    899990,
                    "Sakaka"
            );
            Lawyers Khaled = new Lawyers(
                    5,
                    "Khaled alhamadan",
                    "https://st3.depositphotos.com/1177973/12547/i/950/depositphotos_125470534-stock-photo-handsome-young-lawyer.jpg",
                    "Arbitration",
                    "9-Jon-1998",
                    "khaled123@gmail.com",
                    899990,
                    "Jeddah"
            );
            Lawyers Mohammad = new Lawyers(
                    6,
                    "Mohammad almanssor",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRxr-AWLdfganQvKrJUVmzuv2735Ya2Lg0XmoI0UM8i8qdIMxYQLKNzqYTpy5ovCWslW3c&usqp=CAU",
                    "Arbitration",
                    "9-Jon-1998",
                    "moh123@gmail.com",
                    899990,
                    "Makkah"
            );
            Lawyers Nasser = new Lawyers(
                    7,
                    "Nasser alhamadan",
                    "https://nbltop100.org/wp-content/uploads/2020/04/eric_cottle-1.jpeg",
                    "Pleadings",
                    "9-Jon-1998",
                    "nasser123@gmail.com",
                    899990,
                    "Sakaka"
            );
            Lawyers Omar = new Lawyers(
                    8,
                    "Omar alkhaled",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_cegMw8xz8arPu96ars2cAHzWdSLsBga3I20ihMp3MQary8wS8R6tHwOmlm762RGiJys&usqp=CAU",
                    "Pleadings",
                    "9-Jon-1998",
                    "Omar123@gmail.com",
                    899990,
                    "Sakaka"
            );
            Lawyers Osamah = new Lawyers(
                    9,
                    "Osamah alhussain",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjVzlmmoqZ5oWn5gjxPbzZISAHBrgnrBP5vg&usqp=CAU",
                    "Pleadings",
                    "9-Jon-1998",
                    "osamah123@gmail.com",
                    899990,
                    "Jeddah"
            );
            repository.saveAll(List.of(ahmad,Nasser,Omar,Naif,Osamah,Sami,Maram,Mohammad,Khaled));
        };
    }
}