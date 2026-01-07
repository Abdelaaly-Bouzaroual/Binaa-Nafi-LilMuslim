# Binaa Nafsi - Muslim Daily Tracker (برنامج البناء النفسي للمسلم)

## 📖 Description
**Binaa Nafsi** est une application web minimaliste conçue pour aider le musulman à suivre ses habitudes quotidiennes spirituelles et professionnelles. 

Basée sur le formulaire de suivi du "Programme de Construction Psychologique" (برنامج البناء النفسي), elle permet de tracker :
- ✅ Les 5 prières obligatoires et les Sounan (Nawafil).
- 📖 La lecture du Coran, Hadith et lectures générales.
- 🤲 Les Adhkar (Matin, Soir, Fonctionnels).
- 💼 L'Istikhlaf (Lecture professionnelle/technique).
- 🏃‍♂️ Le bien-être (Sport, Tarwih).

L'objectif est d'offrir un **Dashboard** clair pour visualiser ses progrès et maintenir sa constance (Istiqama).

## 🛠 Tech Stack (Backend)
- **Framework:** Spring Boot 3.2 (Java 17)
- **Database:** PostgreSQL 15 (via Docker)
- **Mapping:** MapStruct
- **Documentation:** OpenAPI (Swagger UI)
- **Tools:** Lombok, Docker Compose, Maven

## 🚀 Démarrage Rapide

### Prérequis
- Java 17+
- Docker & Docker Compose
- Maven

### Installation
1. **Cloner le projet**
   ```bash
   git clone [https://github.com/Abdelaaly-Bouzaroual/Binaa-Nafi-LilMuslim.git](https://github.com/Abdelaaly-Bouzaroual/Binaa-Nafi-LilMuslim.git)
   cd Binaa-Nafi-LilMuslim

```

2. **Lancer la Base de Données (Docker)**
```bash
docker-compose up -d

```


3. **Lancer l'Application**
```bash
mvn spring-boot:run

```



## 📚 Documentation API (Swagger)

Une fois l'application lancée, vous pouvez tester toutes les APIs via l'interface interactive :
👉 **[http://localhost:8080/swagger-ui/index.html](https://www.google.com/search?q=http://localhost:8080/swagger-ui/index.html)**

### Endpoints Principaux

* `POST /api/auth/register` : Créer un nouvel utilisateur.
* `POST /api/logs` : Enregistrer le bilan de la journée.

## ⚠️ Note de développement

* La sécurité (Spring Security) est actuellement configurée en mode "Permit All" pour faciliter le développement du Frontend.
* Le mot de passe utilisateur est stocké en clair (sera chiffré dans la prochaine itération).

## 👤 Auteur

**Abdelaaly** - *Projet personnel d'apprentissage DevOps & Fullstack*




 ## و الله و لي التوفيق