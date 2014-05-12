
/* Imports */
//import javax.naming.Context;
//import javax.naming.NamingEnumeration;
//import javax.naming.directory.*;
//import java.util.*;



   /*set LDAP context */
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, "ldap://180.25.45.77:389/dc=company,dc=com,dc=mx");
        env.put(Context.SECURITY_AUTHENTICATION,"simple");
        env.put(Context.SECURITY_PRINCIPAL,"cn=dummy,dc=company,dc=com,dc=mx"); // specify the username
        env.put(Context.SECURITY_CREDENTIALS,"dummyPass");

        DirContext ctx = null;
        NamingEnumeration results = null;
        
        try{
            ctx = new InitialDirContext(env);
            SearchControls controls = new SearchControls();
            controls.setSearchScope(SearchControls.SUBTREE_SCOPE);


            results = ctx.search("ou=People", "(objectclass=person)", controls);
            
            
            
            while (results.hasMore()) {
                
                /**
                *
                *   Your Code  
                * 
                */

                //SearchResult searchResult = (SearchResult) results.next();
                //Attributes attributes = searchResult.getAttributes();
                //Attribute attr = attributes.get("cn");
                //String cn = (String) attr.get();
                //System.out.println(cn);


                


            }



            ctx.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }
