# spring-security-jwt
This project contains details of how to use Spring Security and implement JWT based authentication and authorization.

**Adding Spring Security authentication**
- Username & password are hard-coded for now

**Adding _`/authenticate`_ API endpoint for creating JWT**
- Accept user ID and password
- Return JWT as a response

**Intercept all incoming requests**
- Extract JWT from the header
- Validate and set in execution context
