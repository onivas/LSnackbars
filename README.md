# Snackbars 
##Snackbars based on Material Design

By Savino Ordine - io.github.onivas.lsnackbars.LSnackbarsLibrary; 

This Lib allow you to create a snackbars like in Android L.
It is also managed button animation: http://www.google.com/design/spec/components/snackbars-and-toasts.html#snackbars-and-toasts-usage 

##How it works

![Snackbars](https://github.com/onivas/LSnackbars/blob/master/lsnackbars.gif)


#Import library
<pre>
import io.github.onivas.lsnackbars.LSnackbarsLibrary;
</pre>

#Add depencence
<pre>
compile project(':library')
</pre>

#Steps
<pre>
// Declare snackbars
final LSnackbarsLibrary lsnackbarsLibrary = new LSnackbarsLibrary(getApplicationContext(), relativeLayout);

// Add button (optional)
final ImageButton menu = (ImageButton) findViewById(R.id.menu_button);

// Show snackbars
Button button = (Button) findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener() {
   @Override
   public void onClick(View view) {
       lsnackbarsLibrary.showLToast("Here I am! ", menu);
    }
});
</pre>
