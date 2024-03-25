# playtech-assignment

**Test** contains the test with english language.
**TestWithLanguage** contains the test with estonian language.

## Tests

### Test

This test verifies the presence of "Global presence" text on the Playtech website using the English language.

1. **Test File:** `Test.java`
2. **Output File:** `global_presenceEN.txt`
3. **Description:**
   - The test navigates to the Playtech website.
   - It checks if the "Global presence" text is present on the page.
   - If the text is found, it writes "Global presence is shown on the page." to the output file.

### TestWithLanguage

This test verifies the absence of "Global presence" text on the Playtech website using the Estonian language.

1. **Test File:** `TestWithLanguage.java`
2. **Output File:** `global_presenceET.txt`
3. **Description:**
   - The test navigates to the Playtech website.
   - It switches the language to Estonian.
   - It checks if the "Global presence" text is absent on the page.
   - If the text is not found, it writes "Global presence is not shown on the page." to the output file.

## Notes
The presence of "Global presence" text may vary depending on the language used on the website.
Both tests are designed to handle the presence or absence of the text based on the specified language.
**Result**:

Test creates a global_presenceEN.txt file which shows the presence of "global presence" whereas TestWithLanguage creates a global_presenceET.txt file which shows no presence of "global presence" whih makes sense as "global presence" is said something else in estonian and it won't be present.
