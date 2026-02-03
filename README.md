--Hospital Management System (Data Structures Implementation)
Bu proje, bir hastane sistemindeki hasta kayıt, tedavi sırası ve taburcu işlemlerini yönetmek için çeşitli veri yapılarının (Stack, Queue, Priority Queue) Java ile uygulanmasını içerir. Proje, nesne yönelimli programlama prensipleri doğrultusunda modüler bir yapıda geliştirilmiştir.

--Proje Yapısı
Hasta Yönetimi: Hasta bilgilerinin (Patient.java) listelenmesi ve yönetilmesi.

Tedavi Kuyruğu (Queue): Hastaların tedavi önceliklerine göre sıralanması (TreatmentQueue.java, PriorityQueue.java).

Taburcu Kayıtları (Stack): Son giren ilk çıkar (LIFO) prensibiyle taburcu olan hasta kayıtlarının tutulması (DischargeStack.java).

Test Odaklı Geliştirme: Her veri yapısı için özel test sınıfları (PatientListTestClass.java, DischargeStackTestClass.java vb.) ile kod güvenilirliği sağlanmıştır.

src/
├── Patient.java             # Hasta veri modeli
├── HospitalSystem.java      # Ana yönetim mantığı
├── TreatmentQueue.java      # Kuyruk (Queue) uygulaması
├── DischargeStack.java      # Yığın (Stack) uygulaması
├── PriorityQueue.java       # Öncelikli Kuyruk uygulaması
└── ...TestClass.java        # Birim test dosyaları

--Teknik Detaylar ve Veri Yapıları
Projeyi oluştururken aşağıdaki veri yapılarını manuel olarak implemente ettim:

Priority Queue: Aciliyet durumuna göre hasta önceliklendirme.

Custom Stack: Taburcu edilen hastaların geçmişini takip etmek için LIFO yapısı.

Linked List tabanlı Listeler: Verimli veri ekleme ve çıkarma işlemleri için.


--Nasıl Çalıştırılır?
Repoyu yerel makinenize klonlayın: git clone https://github.com/Hira-ileyna/HW2.git

Main.java dosyasını bir Java IDE'sinde (IntelliJ, Eclipse, VS Code) açın.

Uygulamayı başlatmak için Main sınıfını çalıştırın.



--Hospital Management System (Data Structures Implementation)
This project features a comprehensive Hospital Management System designed to handle patient registration, treatment scheduling, and discharge processes using core data structures implemented in Java. The system is built with a modular approach, strictly adhering to Object-Oriented Programming (OOP) principles.

--Project Structure
Patient Management: Efficiently listing and managing patient records via Patient.java.

Treatment Queue: Sorting patients based on treatment priorities using TreatmentQueue.java and PriorityQueue.java.

Discharge Records (Stack): Maintaining a history of discharged patients using the Last-In, First-Out (LIFO) principle in DischargeStack.java.

Test-Driven Development: High code reliability ensured through dedicated test classes for each data structure (e.g., PatientListTestClass.java, DischargeStackTestClass.java).

src/
├── Patient.java             # Patient data model
├── HospitalSystem.java      # Main management logic
├── TreatmentQueue.java      # Queue implementation
├── DischargeStack.java      # Stack implementation
├── PriorityQueue.java       # Priority Queue implementation
└── ...TestClass.java        # Unit test files

--Technical Details & Implementation
In this project, I have manually implemented the following data structures to demonstrate a deep understanding of memory management and algorithmic efficiency:

Priority Queue: Used for prioritizing patients based on the urgency of their medical condition.

Custom Stack: Implemented to track the history of discharged patients using a LIFO structure.

Linked List-based Lists: Utilized for efficient data insertion and deletion operations.

--How to Run
Clone the repository to your local machine: git clone https://github.com/Hira-ileyna/HW2.git

Open the Main.java file in your preferred Java IDE (IntelliJ IDEA, Eclipse, or VS Code).

Run the Main class to start the application.
