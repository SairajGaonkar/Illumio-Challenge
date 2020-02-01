Illunio-Firewall-Challenge

It took me about 90 mins to come up with this implementation.

Problem Statement- 
Given a set of firewall rules, a network packet will be accepted by the firewall if 
and only if the direction, protocol, port, and IP address match at least one of the input rules. 
If a rule contains a port range, it will match all packets whose port falls within the range. 
If a rule contains an IP address range, it will match all packets whose IP address falls within the range.

Explanation -

1. Firewall.java - Firewall constructor to get input file path.Contains the accept_packet function.
2. IpAddress.java - Class to check and validate IpAddress.
3. Port.java - Class to check and validate Port number.
4. Rules.java - Creates a rule based on input file.

Testing -

1. Tested the code with some JUnit test cases. Coverage was 18%.

Team Interest -

I would like to work with Platform team.




