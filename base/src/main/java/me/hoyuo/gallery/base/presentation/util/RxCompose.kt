package me.hoyuo.gallery.base.presentation.util

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

fun <T> Maybe<T>.ioToMain(): Maybe<T> =
    this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Maybe<T>.computationToMain(): Maybe<T> =
    this.subscribeOn(Schedulers.computation())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Maybe<T>.singleToMain(): Maybe<T> =
    this.subscribeOn(Schedulers.single())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Single<T>.ioToMain(): Single<T> =
    this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Single<T>.computationToMain(): Single<T> =
    this.subscribeOn(Schedulers.computation())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Single<T>.singleToMain(): Single<T> =
    this.subscribeOn(Schedulers.single())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Completable.ioToMain(): Completable =
    this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Completable.computationToMain(): Completable =
    this.subscribeOn(Schedulers.computation())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Completable.singleToMain(): Completable =
    this.subscribeOn(Schedulers.single())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Observable<T>.ioToMain(): Observable<T> =
    this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Observable<T>.computationToMain(): Observable<T> =
    this.subscribeOn(Schedulers.computation())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Observable<T>.singleToMain(): Observable<T> =
    this.subscribeOn(Schedulers.single())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Flowable<T>.ioToMain(): Flowable<T> =
    this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Flowable<T>.computationToMain(): Flowable<T> =
    this.subscribeOn(Schedulers.computation())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Flowable<T>.singleToMain(): Flowable<T> =
    this.subscribeOn(Schedulers.single())
        .observeOn(AndroidSchedulers.mainThread())
