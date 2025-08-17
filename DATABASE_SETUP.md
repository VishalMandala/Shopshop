# Database Setup Guide

## PostgreSQL Setup

### 1. Install PostgreSQL

#### macOS (using Homebrew)
```bash
brew install postgresql@15
brew services start postgresql@15
```

#### Windows
- Download from: https://www.postgresql.org/download/windows/
- Use the installer and follow the setup wizard

#### Linux (Ubuntu/Debian)
```bash
sudo apt update
sudo apt install postgresql postgresql-contrib
sudo systemctl start postgresql
sudo systemctl enable postgresql
```

### 2. Create Database and User

```bash
# Connect to PostgreSQL as superuser
psql postgres

# Create database
CREATE DATABASE shopshop;

# Create user (optional - you can use 'postgres' user)
CREATE USER shopshop_user WITH PASSWORD 'your_password';

# Grant privileges
GRANT ALL PRIVILEGES ON DATABASE shopshop TO shopshop_user;

# Exit
\q
```

### 3. Update Application Properties

Edit `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/shopshop
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 4. Run the Application

#### Development Mode (H2 Database)
```bash
mvn spring-boot:run -Dspring.profiles.active=dev
```
- H2 Console available at: http://localhost:8080/api/h2-console

#### Production Mode (PostgreSQL)
```bash
mvn spring-boot:run -Dspring.profiles.active=prod
```

### 5. Environment Variables (Production)

Set these environment variables for production:
```bash
export DATABASE_URL=jdbc:postgresql://your-host:5432/shopshop
export DATABASE_USERNAME=your_username
export DATABASE_PASSWORD=your_password
```

## Database Schema

The application will automatically create these tables:
- `categories` - Main product categories
- `subcategories` - Subcategories within categories
- `products` - Individual products

## Troubleshooting

### Connection Issues
1. Ensure PostgreSQL is running
2. Check port 5432 is not blocked
3. Verify username/password
4. Check database exists

### Performance Tips
1. Use connection pooling (already configured)
2. Index frequently queried columns
3. Monitor query performance with logging

## Development vs Production

- **Development**: Uses H2 in-memory database for fast startup
- **Production**: Uses PostgreSQL for reliability and scalability
