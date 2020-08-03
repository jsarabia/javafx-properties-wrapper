package dev.jbs.jfxpropertieswrapper

import javafx.beans.Observable
import javafx.beans.property.*
import javafx.beans.value.ObservableValue
import javafx.collections.ObservableList

typealias JFXObservable = Observable
typealias JFXObservableValue<T> = ObservableValue<T>
typealias JFXObservableList<T> = ObservableList<T>

class JFXSimpleStringProperty() : SimpleStringProperty()
class JFXSimpleBooleanProperty() : SimpleBooleanProperty()
class JFXSimpleDoubleProperty() : SimpleDoubleProperty()

typealias JFXSimpleFloatProperty = SimpleFloatProperty
typealias JFXSimpleIntegerProperty = SimpleIntegerProperty

