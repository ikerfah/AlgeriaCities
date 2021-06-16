# Algeria Cities


Android library that help with manipulating cities in algeria.


# Download!
Add it in your root build.gradle at the end of repositories:

```
allprojects {
        repositories {
	        ...
		maven { url 'https://jitpack.io' }
	}
}
```
and then
```
implementation 'com.github.ikerfah:AlgeriaCities:0.2'
```
### Functions

| Name | Description |
| ------ | ------ |
| getWilayaById(int) | Get desired wilaya by identifier |
| getWilayaByName(String) | Get desired wilaya by name |
| getCommunesByWilayaId(int) | Get desired communes by wilaya identifier |
| getAllWilaya() | Get all wilaya |

###### Example
```AlgeriaCities.getWilayaById(44)```

### Widgets

| Name | Description |
| ------ | ------ |
| WilayaSpinner | Spinner with predefined wilaya list |
| CommuneSpinner | Spinner with predefined commune for selected wilaya from WilayaSpinner **Check attachCommuneSpinner** |


###### Example

```
<com.ikerfah.algeriacities.widgets.WilayaSpinner
        android:id="@+id/spinner"
        android:spinnerMode="dropdown"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:lang="arabic"/>

<com.ikerfah.algeriacities.widgets.CommuneSpinner
        android:id="@+id/spinner_child"
        android:layout_width="match_parent"
        android:spinnerMode="dropdown"
        android:layout_height="wrap_content"
        app:lang="french"/>
```
###### Tips and tricks 
* Use ```wilayaSpinner.attachCommuneSpinner(CommuneSpinner)```
Then the communeSpinner will change automatically when the wilaya changed
* use ```setOnZoneItemSelectedListener``` for both Wilaya/Commune spinner and get selected wilaya/commune as first parameter along with other default parameters such as position

###### Example
```
spinner.setOnZoneItemSelectedListener(object: OnZoneItemSelected<Wilaya>{
            override fun onItemSelected(
                selectedZone: Wilaya?,
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(parent?.context, selectedZone?.nomFr, Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        })
```
### XML Attributes (only with WilayaSpinner and CommuneSpinner)

| Name | Description | Values |
| ------ | ------ | ------ |
| Lang | Default spinner language | french/arabic (Default french) |
 
 ###### Example
```app:lang="french"```
or
```app:lang="arabic"```

## Contacts
* If you have a concrete bug report for AlgeriaCites please go to the Issues Tracker, submit your report and tag it "bug".
* If you want to criticize the project, Feel free and contact me at : i.kerfah@gmail.com
