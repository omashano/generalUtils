/*
 * Copyright 2016 Ayoub Bouhtouch
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.omashano.generalutils;

import android.os.Parcel;
import android.os.Parcelable;

public class Meta implements Parcelable {

    private Pagination pagination;

    public Meta () {}

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "pagination=" + pagination +
                '}';
    }

    public static class Pagination implements Parcelable {

        private int total;
        private int count;
        private int per_page;
        private int current_page;
        private int total_page;

        public Pagination setTotal(int total) {
            this.total = total;
            return this;
        }

        public Pagination setCount(int count) {
            this.count = count;
            return this;
        }

        public Pagination setPer_page(int per_page) {
            this.per_page = per_page;
            return this;
        }

        public Pagination setCurrent_page(int current_page) {
            this.current_page = current_page;
            return this;
        }

        public Pagination setTotal_page(int total_page) {
            this.total_page = total_page;
            return this;
        }

        public int getTotal() {
            return total;
        }

        public int getCount() {
            return count;
        }

        public int getPer_page() {
            return per_page;
        }

        public int getCurrent_page() {
            return current_page;
        }

        public int getTotal_page() {
            return total_page;
        }

        @Override
        public String toString() {
            return "Pagination{" +
                    "total=" + total +
                    ", count=" + count +
                    ", per_page=" + per_page +
                    ", current_page=" + current_page +
                    ", total_page=" + total_page +
                    '}';
        }


        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.total);
            dest.writeInt(this.count);
            dest.writeInt(this.per_page);
            dest.writeInt(this.current_page);
            dest.writeInt(this.total_page);
        }

        public Pagination() {
        }

        protected Pagination(Parcel in) {
            this.total = in.readInt();
            this.count = in.readInt();
            this.per_page = in.readInt();
            this.current_page = in.readInt();
            this.total_page = in.readInt();
        }

        public static final Parcelable.Creator<Pagination> CREATOR = new Parcelable.Creator<Pagination>() {
            public Pagination createFromParcel(Parcel source) {
                return new Pagination(source);
            }

            public Pagination[] newArray(int size) {
                return new Pagination[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.pagination, 0);
    }

    protected Meta(Parcel in) {
        this.pagination = in.readParcelable(Pagination.class.getClassLoader());
    }

    public static final Parcelable.Creator<Meta> CREATOR = new Parcelable.Creator<Meta>() {
        public Meta createFromParcel(Parcel source) {
            return new Meta(source);
        }

        public Meta[] newArray(int size) {
            return new Meta[size];
        }
    };
}