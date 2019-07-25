/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {
  View,
  StyleSheet
} from 'react-native';
import { NativeModules } from 'react-native';

class App extends Component {

  componentDidMount(){
	var LoadingOverlay = NativeModules.LoadingOverlay;
	//Let's show it
	LoadingOverlay.toggle(true).then(result => {
		console.log('show', result)
	})
	// And let's hide it after 3 seconds
	setTimeout(()=>{
		LoadingOverlay.toggle(false).then(result=>{
			console.log("hide", result)
		})
	}, 3000)
  }

  render(){
	return ( <View style={styles.background}></View>)
  }
   

};

const styles = StyleSheet.create({
  background: {
	backgroundColor: '#6ce6cb',
	flex: 1,
  },
});

export default App