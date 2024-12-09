<!DOCTYPE html>
<html>
<body>
    <h1>Passport Registration Form</h1>
    <form action="submit-registration" method="post">
        <!-- Registration Type -->
        <label for="passportOffice">Passport Office *</label>
        <select id="passportOffice" name="passportOffice" required>
            <option value="">----- Select -----</option>
            <option value="CPV Delhi">CPV Delhi</option>
            <option value="Delhi">Delhi (for Tibetan Refugees)</option>
        </select>
        <br><br>

        <label for="givenName">Given Name (Max 45 Characters) *</label>
        <input type="text" id="givenName" name="givenName" maxlength="45" placeholder="First Name + Middle Name" required>
        <br><br>

        <label for="surname">Surname (Max 45 Characters)</label>
        <input type="text" id="surname" name="surname" maxlength="45" placeholder="Last Name">
        <br><br>

        <label for="dob">Date of Birth (DD/MM/YYYY) *</label>
        <input type="text" id="dob" name="dob" placeholder="DD/MM/YYYY" required>
        <br><br>

        <label for="email">E-mail ID (Max 35 Characters) *</label>
        <input type="email" id="email" name="email" maxlength="35" required>
        <br><br>

        <label>Do you want your Login ID to be the same as your E-mail ID?</label>
        <input type="radio" id="loginIdYes" name="loginIdChoice" value="yes">
        <label for="loginIdYes">Yes</label>
        <input type="radio" id="loginIdNo" name="loginIdChoice" value="no">
        <label for="loginIdNo">No</label>
        <br><br>

        <label for="loginId">Login ID *</label>
        <input type="text" id="loginId" name="loginId" required>
        <button type="button">Check Availability</button>
        <br><br>

        <label for="password">Password *</label>
        <input type="password" id="password" name="password" required>
        <br><br>

        <label for="confirmPassword">Confirm Password *</label>
        <input type="password" id="confirmPassword" name="confirmPassword" required>
        <br><br>

        <label for="hintQuestion">Hint Question *</label>
        <select id="hintQuestion" name="hintQuestion" required>
            <option value="">----- Select -----</option>
            <option value="petName">What is your pet's name?</option>
            <option value="motherMaidenName">What is your mother's maiden name?</option>
            <option value="birthCity">In what city were you born?</option>
        </select>
        <br><br>

        <label for="hintAnswer">Hint Answer *</label>
        <input type="text" id="hintAnswer" name="hintAnswer" required>
        <br><br>
        <button type="submit">Register</button>
    </form>
</body>
</html>
